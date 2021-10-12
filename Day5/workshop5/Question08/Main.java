package workshop5.Question08;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		System.out.println("Welcome to the Product Maintenace Application");
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		menu.displayMenu();
		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			action = Validator.getString(sc, "Enter a command:");
			System.out.println();

			if (action.equalsIgnoreCase("list")) {
				menu.displayProducts();
			} else if (action.equalsIgnoreCase("add")) {
				menu.addProduct();
			} else if (action.equalsIgnoreCase("del")) {
				menu.deleteProduct();
			} else if (action.equalsIgnoreCase("help")) {
				menu.displayMenu();
			} else if (action.equalsIgnoreCase("exit")) {
				System.out.println("Thanks for using this app.");
			} else {
				System.out.println("Invalid command. Try again");
			}
		}
	}

}
