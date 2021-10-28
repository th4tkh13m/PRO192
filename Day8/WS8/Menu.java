package WS8;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static int getMenuChoice() {
        System.out.println("1. Add new tour");
        System.out.println("2. List all domestic tours in the system.");
        System.out.println("3. Compute the average tour charge of all international tours");
        System.out.println("4. Search tour by minimum tour charge");
        System.out.println("5. Remove the tour having given code");
        System.out.println("6. Sort all tours of list by multiple levels in descending order of tour’s price and then in ascending order of tour’s title");
        System.out.println("7. Update tour information");
        System.out.println("8. Save/ Load tours to/ from file");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
