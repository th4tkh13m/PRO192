package workshop6.Question3;

import java.util.ArrayList;
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
			} catch (Exception InputMismatchException) {
				System.out.println("You did not enter an integer!");
				in.nextLine();
			}
		}
	}

	public static boolean inputYN() {
		while (true) {
			System.out.println("Enter y/Y or n/N.");
			String input = Validator.inputString();
			if (input.equalsIgnoreCase("Y")) {
				return true;
			}
			else if (input.equalsIgnoreCase("N")) {
				return false;
			}
			else System.out.println("Invalid input. Try again.");
		}
	}

	public static int checkBookID(ArrayList<Book> bookList, int id) {
		for (Book book : bookList) {
			if (book.getId() == id) {
				return bookList.indexOf(book);
			}
		}
		return -1;
	}
}

