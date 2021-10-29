package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import Components.Validator;

public class TourList extends ArrayList<Tour> {

	public TourList() {
	}

	public void loadFromFile(String fname) {
		if (this.size() > 0) {
			this.clear();
		}

		try {
			File file = new File(fname);
			if (!file.exists()) {
				System.out.println("File not found");
				return;
			}

			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				String tourType = tokenizer.nextToken();
				String code = tokenizer.nextToken();
				String title = tokenizer.nextToken();
				double price = Double.parseDouble(tokenizer.nextToken());
				String transport = tokenizer.nextToken();
				String start = tokenizer.nextToken();
				String end = tokenizer.nextToken();
				LocalDate startDate = Validator.convertDate(start);
				LocalDate endDate = Validator.convertDate(end);
				if (tourType.equals("Domestic")) {
					double tourGuideTip = Double.parseDouble(tokenizer.nextToken());
					this.add(new DomesticTour(code, title, price, transport, startDate, endDate, tourGuideTip));
				} else {
					double aviationTax = Double.parseDouble(tokenizer.nextToken());
					double entryFee = Double.parseDouble(tokenizer.nextToken());
					this.add(new InternationalTour(code, title, price, transport, startDate, endDate, aviationTax,
							entryFee));
				}
			}

			bufferedReader.close();
			fileReader.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void saveToFile(String fname) {
		try {
			File file = new File(fname);
			FileWriter fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			for (Tour tour : this) {
				if (tour instanceof DomesticTour) {
					printWriter.println("Domestic," + tour.getCode() + "," + tour.getTitle() + "," + tour.getPrice()
							+ "," + tour.getTransport() + "," + tour.getStartDate() + "," + tour.getEndDate() + ","
							+ ((DomesticTour) tour).getTourGuideTip());
				} else {
					printWriter.println("International," + tour.getCode() + "," + tour.getTitle() + ","
							+ tour.getPrice() + "," + tour.getTransport() + "," + tour.getStartDate() + ","
							+ tour.getEndDate() + "," + ((InternationalTour) tour).getAviationTax() + ","
							+ ((InternationalTour) tour).getEntryFee());
				}

			}

			printWriter.close();
			fileWriter.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void addTour() {
		String code = Validator.validateCode(this);
		String title = Validator.inputString();
		double price = Validator.inputDouble();
		String transport = Validator.inputTransportation();
		LocalDate startDate = Validator.inputDate();
		LocalDate endDate = Validator.inputDate();

		int choice = Validator.inputTourType();
		if (choice == 1) {
			double tourGuideTip = Validator.inputDouble();
			DomesticTour tour = new DomesticTour(code, title, price, transport, startDate, endDate, tourGuideTip);
			this.add(tour);
		} else {
			double aviationTax = Validator.inputDouble();
			double entryFee = Validator.inputDouble();
			InternationalTour tour = new InternationalTour(code, title, price, transport, startDate, endDate,
					aviationTax, entryFee);
			this.add(tour);
		}
		System.out.println("Add succesfully");
	}

	public void printDomesticTours() {
		for (Tour tour : this) {
			if (tour instanceof DomesticTour) {
				System.out.println(tour);
			}
		}
	}

	public double averageInternationalCharge() {
		double total = 0;
		int count = 0;
		for (Tour tour : this) {
			if (tour instanceof InternationalTour) {
				total += ((InternationalTour) tour).calculateCharge();
				count++;
			}
		}
		return total / count;
	}

	public void searchMinimumChargeTour() {
		double minChargeTour = this.get(0).calculateCharge();
		Tour minTour = null;
		for (Tour tour : this) {
			if (tour.calculateCharge() < minChargeTour) {
				minChargeTour = tour.calculateCharge();
				minTour = tour;
			}
		}
		System.out.println("Minimum charge tour is " + minTour);

	}

	public void removeByCode() {
		if (this.isEmpty()) {
			System.out.println("No Tour");
			return;
		}
		String code = Validator.inputString();
		int index = Validator.searchCode(this, code);
		if (index != -1) {
			this.remove(index);
		} else {
			System.out.println("Not found");
		}
	}

	public void updateTour() {
		if (this.isEmpty()) {
			System.out.println("No Tour");
			return;
		}
		String code = Validator.inputString();
		int index = Validator.searchCode(this, code);
		if (index != -1) {
			String title = Validator.inputString();
			double price = Validator.inputDouble();
			String transport = Validator.inputTransportation();
			LocalDate startDate = Validator.inputDate();
			LocalDate endDate = Validator.inputDate();

			int choice = Validator.inputTourType();
			if (choice == 1) {
				double tourGuideTip = Validator.inputDouble();
				DomesticTour tour = new DomesticTour(code, title, price, transport, startDate, endDate, tourGuideTip);
				this.set(index, tour);
			} else {
				double aviationTax = Validator.inputDouble();
				double entryFee = Validator.inputDouble();
				InternationalTour tour = new InternationalTour(code, title, price, transport, startDate, endDate,
						aviationTax, entryFee);
				this.set(index, tour);
			}
			System.out.println("Update succesfully");
		} else {
			System.out.println("Not found");
		}
	}

	public void listSort() {
		int choice = Validator.inputSort();
		if (choice == 1) {
			Collections.sort(this, new SortByPrice());
		} else {
			Collections.sort(this, new SortByTitle());
			Collections.reverse(this);
		}
		for (Tour tour : this) {
			System.out.println(tour);
		}
	}

}
