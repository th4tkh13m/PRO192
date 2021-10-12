package workshop5.Question08;

import java.util.Scanner;
public class Menu {

	private ProductDAO productDAO = new Storage();
	private Scanner sc = new Scanner(System.in);
	public Menu() {
	}
	public void displayMenu() {
		System.out.println("COMMANDS");
		System.out.println("list: List all products");
		System.out.println("add: Add a product");
		System.out.println("del: Delete a product");
		System.out.println("help: Show this menu");
		System.out.println("exit: Exit this Menu");
	}

	public void displayProducts() {
		System.out.println("Product list");
		System.out.println(productDAO.getProductsString());
	}

	public void addProduct() {
		String code = Validator.getString(sc, "Enter product code");
		String description = Validator.getLine(sc, "Enter description");
		double price = Validator.getDouble(sc, "Enter Price:");
		Product p = new Product(code, description, price);
		productDAO.addProduct(p);
	}

	public void deleteProduct() {
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
