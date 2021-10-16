package workshop6.Question3;

import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

	Scanner sc = new Scanner(System.in);
	public static int menu() {
		System.out.println("Menu");
		System.out.println("1. Add");
		System.out.println("2. Display");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Please enter your choice");
		int choice = Validator.inputIntLimit(1, 5);
		return choice;
	}
}
