package workshop6.Question2;

import java.util.Scanner;

/**
 * Validator
 */
public class Validator {

	private static Scanner in = new Scanner(System.in);
	public static String inputString() {
		while (true) {
			String input = in.nextLine();
			if (!input.isEmpty()) {
				return input;
			}
			System.out.println("Please enter a non-empty string.");
		}
	}

	public static int inputIntLimit(int min, int max) {
		while (true) {
			try {
				int input = in.nextInt();
				if ((input >= min) && (input <= max)) {
					return input;
				}
				System.out.println("Invalid integer.");
			}
			catch (Exception InputMismatchException) {
				System.out.println("You did not enter an integer!");
				in.nextLine();
			}
		}
	}
}
