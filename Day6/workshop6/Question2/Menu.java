package workshop6.Question2;

/**
 * Menu
 */
public class Menu {

	    public static int menu() {
        System.out.println("COURSE MANAGEMENT SYSTEM");
        System.out.println("1. A list of all available courses in the system");
        System.out.println("2. Search and display information of a course by a course id");
        System.out.println("3. Record/Add information of course");
        System.out.println("4. Sort all courses by number of credit as ascending");
        System.out.println("5. Update information of a specific course (by course id)");
		System.out.println("0. Exit");
        return Validator.inputIntLimit(0, 5);
    }

}
