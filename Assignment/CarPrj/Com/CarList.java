package Com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * CarList
 */
public class CarList extends ArrayList<Car> {

	private BrandList brandList;

	public CarList(BrandList brandList) {
		this.brandList = brandList;
	}

	public boolean loadFromFile(String fname) {
		// Clear the array if it is not null
		if (this.size() > 0) {
			this.clear();
		}

		// Try to read file
		try {
			File file = new File(fname);
			if (!file.exists()) {
				System.out.println("File does not exist");
				return false;
			}
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			// Extract data
			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				String carID = tokenizer.nextToken();
				String brandId = tokenizer.nextToken();
				String color = tokenizer.nextToken();
				String frameID = tokenizer.nextToken();
				String engineID = tokenizer.nextToken();

				int index = brandList.searchID(brandId);
				Brand brand = brandList.get(index);

				Car car = new Car(carID, brand, color, frameID, engineID);
				this.add(car);
			}

			// Close File
			bufferedReader.close();
			fileReader.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	public boolean saveToFile(String fname) {
		if (this.size() == 0) {
			System.out.println("Empty Brand");
			return false;
		}
		try {
			File file = new File(fname);
			FileWriter fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			for (Car car : this) {
				printWriter.println(car.getCarId() + "," + car.getBrand().getBrandId() + "," + car.getColor() + ","
						+ car.getFrameID() + "," + car.getEngineID());
			}

			printWriter.close();
			fileWriter.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	public int searchID(String carID) {
		for (int index = 0; index < this.size(); index++) {
			if (this.get(index).getCarId() == carID) {
				return index;
			}
		}
		return -1;
	}

	public int searchFrame(String frameID) {
		for (int index = 0; index < this.size(); index++) {
			if (this.get(index).getFrameID() == frameID) {
				return index;
			}
		}
		return -1;
	}

	public int searchEngine(String engineID) {
		for (int index = 0; index < this.size(); index++) {
			if (this.get(index).getEngineID() == engineID) {
				return index;
			}
		}
		return -1;
	}

	public void addCar() {
		String carID;

		System.out.println("Please enter a Car ID: ");
		carID = Validator.inputString();

		if (searchID(carID) != -1) {
			System.out.println("Car ID cannot be duplicated!");
			return;
		}

		Menu<Brand> menu = new Menu<Brand>();
		Brand brand = menu.ref_getChoice(brandList);

		System.out.println("Please enter a color: ");
		String color = Validator.inputString();

		String frameID = Validator.inputFrame();
		String engineID = Validator.inputEngine();

		Car car = new Car(carID, brand, color, frameID, engineID);
		this.add(car);
	}

	public boolean removeCar() {
		if (this.isEmpty()) {
			System.out.println("There is no car to remove!");
			return false;
		}

		System.out.println("Please enter a removed ID");
		String removedID = Validator.inputString();

		int index = searchID(removedID);
		if (index == -1) {
			System.out.println("Not found!");
			return false;
		} else {
			this.remove(index);
			System.out.println("Remove ID " + removedID + " successfully!");
		}
		return true;
	}

	public boolean updateBrand() {
		if (this.isEmpty()) {
			System.out.println("There is no car to update!");
			return false;
		}

		System.out.println("Please enter a Car ID");
		String carID = Validator.inputString();

		int index = searchID(carID);
		if (index == -1) {
			System.out.println("Not found!");
			return false;
		} else {
			Menu<Brand> menu = new Menu<Brand>();
			Brand brand = menu.ref_getChoice(brandList);

			System.out.println("Please enter a color: ");
			String color = Validator.inputString();

			String frameID = Validator.inputFrame();
			String engineID = Validator.inputEngine();

			Car car = new Car(carID, brand, color, frameID, engineID);

			this.set(index, car);
		}
		return true;
	}

	public void listCars() {
		for (Car car : this) {
			System.out.println(car.screenString());
		}
	}
}
