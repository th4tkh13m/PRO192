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
		
	}
}
