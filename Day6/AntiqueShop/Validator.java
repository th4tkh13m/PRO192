package AntiqueShop;

import java.util.Scanner;

public class Validator {
    public static String getString(Scanner sc, String prompt) {
        System.out.println(prompt);
        String s = sc.nextLine();
        return s;
    }

    public static int getInt(Scanner sc, String prompt) {
        boolean isValid = false;
        int num = 0;
        do {
            System.out.println(prompt);
            try {
                num = sc.nextInt();
                isValid = true;
            } catch (Exception NumberFormatException) {
                System.out.println("Invalid integer. Please try again.");
                sc.nextLine();
            }
        } while (!isValid);
        return num;
    }

    public static boolean getBoolean(Scanner sc, String prompt) {
        boolean isValid = false;
        boolean choice = true;
        do {
            System.out.println(prompt);
            try {
                choice = sc.nextBoolean();
                isValid = true;
            } catch (Exception NumberFormatException) {
                System.out.println("Invalid value. Please try again.");
                sc.nextLine();
            }
        } while (!isValid);
        return choice;

    }
}
