package workshop6.Question3;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		int choice;
		BookList bookList = new BookList();
		while (true) {
			choice = Menu.menu();

			switch (choice) {
			case 1:
				bookList.addBook();
				break;
			case 2:
				bookList.display();
				break;
			case 3:
				bookList.update();
				break;
			case 4:
				bookList.delete();
				break;
			case 5:
				return;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}
}
