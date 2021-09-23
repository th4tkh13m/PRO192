package workshop3;

import java.util.Scanner;

public class Validation {
    public static Scanner in = new Scanner(System.in);
    public static String checkInputString() {
    while (true) {
        String result = in.nextLine().trim();
        if (result.isEmpty()) {
            System.err.println("Not empty");
            System.out.print("Enter again: ");
        } else {
            return result;
        }
    }
}
    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }
    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble((in.nextLine().trim()));
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }
}
