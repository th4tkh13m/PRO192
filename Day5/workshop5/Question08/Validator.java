package workshop5.Question08;

import java.util.Scanner;

/**
 * Validator
 */
public class Validator {

	public static String geString(Scanner sc, String prompt) {
		System.out.println(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}

	public static String getLine(Scanner sc, String prompt) {
		System.out.println(prompt);
		String s = sc.nextLine();
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		boolean isValid = false;
		int i = 0;
		while (isValid == false) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value.");
			}
			sc.nextLine();
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		boolean isValid = false;
		double num = 0;
		while (isValid == false) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				num = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid double value.");
			}
			sc.nextLine();
		}
		return num;
	}
}
