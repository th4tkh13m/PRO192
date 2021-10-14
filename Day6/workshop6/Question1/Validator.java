package workshop6.Question1;

import java.util.List;
import java.util.Scanner;

public class Validator {
    private final static Scanner in = new Scanner(System.in);

    public static int checkInputLimit(int min, int max) {
        while (true) {
            System.out.println("Please enter a number in range [" + min + ", " + max + "]");
            int num = in.nextInt();
            in.nextLine();
            if ((num >= min) && (num <= max)) {
                return num;    
            }
            System.out.println("Invalid range. Try again");
        }
    }
    
    public static String checkInputString() {
        while (true) {
            String input = in.nextLine();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Entered an empty string. Try again");
        }
    }
    
    public static boolean checkInputYN() {
        while (true) {
            System.out.println("Please enter y/Y or n/N");
            String input = checkInputString();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            }
            else if (input.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Invalid. Try again.");
        }
    }
    public static char checkInputUD() {
        while (true) {
            System.out.println("Please enter u/U or d/D");
            String input = checkInputString();
            if (input.equalsIgnoreCase("U")) {
                return 'u';
            }
            else if (input.equalsIgnoreCase("D")) {
                return 'd';
            }
            System.out.println("Invalid. Try again.");
        }
    }
    
    public static String checkInputCourse() {
        while (true) {
            System.out.println("There are 3 courses: Python, Julia, R. Choose one.");
            String input = checkInputString();
            if (input.equalsIgnoreCase("Python") || input.equalsIgnoreCase("Julia") || input.equalsIgnoreCase("R")) {
                return input;
            }
            System.out.println("Please try again.");
        }
    }
    
    public static int checkIDExist(List<Student> lStudents, String id) {
        for (Student student : lStudents) {
            if (student.getId().equalsIgnoreCase(id)) {
                return lStudents.indexOf(student);
            }
        }
        return -1;
    }
}
