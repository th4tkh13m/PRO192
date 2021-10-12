package workshop5.Question08;

import java.util.Scanner;

public class Main {

	private static ProductDAO productDAO = null;
	private static Scanner sc = null;

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Maintenace Application");

		sc = new Scanner(System.in);

		displayMenu();
		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			action = Validator.getString(sc, "Enter a command:");
			System.out.println();

			if (action.equalsIgnoreCase("list")) {
				displayProducts();
			} else if (action.equalsIgnoreCase("add")) {
				addProduct();
			} else if (action.equalsIgnoreCase("del")) {
				deleteProduct();
			} else if (action.equalsIgnoreCase("help")) {
				displayMenu();
			} else if (action.equalsIgnoreCase("exit")) {
				System.out.println("Thanks for using this app.");
			} else {
				System.out.println("Invalid command. Try again");
			}
		}
	}

	public static void displayMenu() {
		System.out.println("COMMANDS");
		System.out.println("list: List all products");
		System.out.println("add: Add a product");
		System.out.println("del: Delete a product");
		System.out.println("help: Show this menu");
		System.out.println("exit: Exit this Menu");
	}

	public static void displayProducts() {
		System.out.println("Product list");
		System.out.println(ProductDAO.getProductsString());
	}

	public static void addProduct() {
		String code = Validator.getString(sc, "Enter product code");
		String description = Validator.getLine(sc, "Enter description");
	}

	public static void deleteProduct() {
		String code = Validator.getString(sc, "Enter the product code");
		Product p = productDAO.getProduct(code);
		if (p != null) {
			productDAO.deleteProduct(p);
			System.out.println(p.getDescription() + "has been deleted.");
		} else {
			System.out.println("There is no such product");
		}
	}
}
