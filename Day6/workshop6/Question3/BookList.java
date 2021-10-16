package workshop6.Question3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * BookList
 */
public class BookList {

	ArrayList<Book> books = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public BookList() {
	}

	public void addBook() {
		while (true) {
			Book book = new Book().createBook();
			if (Validator.checkBookID(books, book.getId()) == -1) {
				books.add(book);
			} else {
				System.out.println("The ID is existed!");
			}
			System.out.println("Continue?");
			if (!Validator.inputYN()) {
				break;
			}
		}
	}

	public void display() {
		if (books.isEmpty()) {
			System.out.println("No book.");
			return;
		}
		for (Book book : books) {
			System.out.println(book);
		}
	}

	public void update() {
		if (books.isEmpty()) {
			System.out.println("No book.");
			return;
		}
		while (true) {
			System.out.println("Enter the Enter course ID");
			int id = Validator.inputIntLimit(1, 10000);
			int index = Validator.checkBookID(books, id);
			if (index != -1) {
				books.set(index, new Book().createBook());
			} else {
				System.out.println("There is no such ID. Wanna create one?");
				if (Validator.inputYN()) {
					System.out.println("Create a new book.");
					addBook();
				}
			}
			System.out.println("Continue?");
			if (!Validator.inputYN()) {
				break;
			}
		}
	}

	public void delete() {
		if (!books.isEmpty()) {
			while (true) {
				System.out.println("Enter ID to update/delete: ");
				int id = Validator.inputIntLimit(1, 10000);
				int index = Validator.checkBookID(books, id);
				if (index != -1) {
					books.remove(index);
				} else {
					System.out.println("The entered ID is existed!");
				}
				System.out.println("Do you want to continue?");
				if (!Validator.inputYN()) {
					break;
				}
			}
		}
		else {
			System.out.println("No book.");
		}
	}
}
