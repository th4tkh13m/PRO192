package Com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * BrandList
 */
public class BrandList extends ArrayList<Brand> {

	public BrandList() {
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
				String brandId = tokenizer.nextToken();
				String brandName = tokenizer.nextToken();
				String soundAndPrice = tokenizer.nextToken();
				tokenizer = new StringTokenizer(soundAndPrice, ":");
				String soundBrand = tokenizer.nextToken();
				int price = Integer.parseInt(tokenizer.nextToken());

				Brand brand = new Brand(brandId, brandName, soundBrand, price);
				this.add(brand);
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

			for (Brand brand : this) {
				printWriter.println(brand.getBrandId() + "," + brand.getBrandName() + "," + brand.getSoundBrand() + ","
						+ brand.getPrice());
			}

			printWriter.close();
			fileWriter.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	public int searchID(String brandId) {
		for (int index = 0; index < this.size(); index++) {
			if (this.get(index).getBrandId() == brandId) {
				return index;
			}
		}
		return -1;
	}

	public Brand getUserChoice() {
		return null;
	}

	public void addBrand() {
		String brandId;

		System.out.println("Please enter a Brand ID: ");
		brandId = Validator.inputString();

		if (searchID(brandId) != -1) {
			System.out.println("Brand ID cannot be duplicated!");
			return;
		}

		System.out.println("Please enter a Brand Name: ");
		String brandName = Validator.inputString();

		System.out.println("Please enter a Brand' sound Manufacturer: ");
		String soundBrand = Validator.inputString();

		System.out.println("Please enter the Brand's price: ");
		double price = Validator.inputDouble();

		Brand brand = new Brand(brandId, brandName, soundBrand, price);
		this.add(brand);
	}

	public void updateBrand() {
		if (this.isEmpty()) {
			System.out.println("No Brand!");
			return;
		}

		System.out.println("Please enter a Brand ID");
		String brandId = Validator.inputString();

		int index = searchID(brandId);
		if (index == -1) {
			System.out.println("Not found!");
		} else {

			System.out.println("Please enter a Brand Name: ");
			String brandName = Validator.inputString();

			System.out.println("Please enter a Brand' sound Manufacturer: ");
			String soundBrand = Validator.inputString();

			System.out.println("Please enter the Brand's price: ");
			double price = Validator.inputDouble();

			Brand brand = new Brand(brandId, brandName, soundBrand, price);
			this.set(index, brand);
		}

	}

	public void listBrands() {
		for (Brand brand : this) {
			System.out.println(brand);
		}
	}

}
