package workshop6.Question2;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		int choice;
		CourseList courseList = new CourseList();
		while (true) {
			choice = Menu.menu();

			switch (choice) {
				case 1:
					courseList.listAll();
					break;
				case 2:
					courseList.search();
					break;
				case 3:
					courseList.add();
					break;
				case 4:
					courseList.sort();
					break;
				case 5:
					courseList.update();
					break;
				case 0:
					return;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}

	}
}
