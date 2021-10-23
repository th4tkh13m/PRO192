package Com;

import java.util.Scanner;

/**
 * Validator
 */
public class Validator {

	private static Scanner sc = new Scanner(System.in);

	public static int inputInt(int min, int max) {
		int input;
		while (true) {
			try {
				System.out.println("Please enter an integer in range [" + min + "," + max + "]");
				input = Integer.parseInt(sc.nextLine());

				// Handle integer's range
				if (input < min || input > max) {
					System.out.println("Please enter a number within the range");
					throw new Exception();
				}

				return input;
			} catch (Exception e) {
				System.out.println("Invalid value");
			}
		}
	}

	public static double inputDouble() {
		double input;
		while (true) {
			try {
				System.out.println("Please enter a positive real number");
				input = Double.parseDouble(sc.nextLine());

				// Handle a negative real number
				if (input <= 0) {
					System.out.println("Please enter a positive number");
					throw new Exception();
				}

				return input;

			} catch (Exception e) {
				System.out.println("Invalid value");
			}
		}
	}

	public static String inputString() {
		String input;
		while (true) {
			try {
				System.out.println("Enter a non-empty String");
				input = sc.nextLine();

				// Handle an empty String
				if (input.isEmpty()) {
					throw new Exception();
				}

				return input;

			} catch (Exception e) {
				System.out.println("Please try again. Do not enter a non-empty String");
			}
		}
	}

	public static String inputFrame() {
		String input;
		while (true) {
			try {
				System.out.println("Please enter Frame ID. It must be in the format 'F000' and cannot be duplicated");
				input = inputString();
				
				if (!input.matches("^F\\d{5}$")) {
					System.out.println("Please enter a String of 'F000'");
					throw new Exception();
				}

				return input;
			} catch (Exception e) {
				System.out.println("Invalid value. Try again");
			}
		}
	}

	public static String inputEngine() {
		String input;
		while (true) {
			try {
				System.out.println("Please enter Engine ID. It must be in the format 'E000' and cannot be duplicated");
				input = inputString();
				
				if (!input.matches("^E\\d{5}$")) {
					System.out.println("Please enter a String of 'E000'");
					throw new Exception();
				}

				return input;
			} catch (Exception e) {
				System.out.println("Invalid value. Try again");
			}
		}
	}
}
