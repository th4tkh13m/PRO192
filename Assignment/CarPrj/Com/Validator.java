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

	// public  name() {
		
	}
}
