package menu;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static int menuChoice() {
        int choice;
        System.out.println("-----MENU-----");
        System.out.println("This is choice 1. It does nothing");
        System.out.println("This is choice 2. It does nothing, too");
        System.out.println("This is choice 3. Useless choice");
        System.out.println("This is choice 4. Exit this useless menu");
        System.out.println("------------");
        System.out.println("Choose wisely");

        choice = input.nextInt();
        return choice;
    }
}
