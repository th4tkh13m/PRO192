package Assignment.WS9.Com;

import java.util.Scanner;

/**
 * Inputter
 */
public class Inputter {

        private static Scanner sc = new Scanner(System.in);

        public static int inputInt(String msg, int min, int max) {
                while (true) {
                        try {

                                System.out.println(msg);
                                System.out.println("Please input an integer in range [" + min + ", " + max + "]");
                                int input = sc.nextInt();

                                if (input < min || input > max) {
                                        System.out.println("Please enter an input in the given range");
                                        throw new Exception();

                                }

                                return input;
                        } catch (Exception e) {
                                System.out.println("Invalid input.");
                        }

                }

        }

        public static String inputNonBlankStr(String msg) {
                while (true) {
                        try {
                                System.out.println(msg);
                                System.out.println("Please enter a non blank String");
                                String input = sc.nextLine();

                                if (input.isBlank()) {
                                        System.out.println("You entered a blank String!");
                                        throw new Exception();
                                }

                                return input;
                        } catch (Exception e) {
                                System.out.println("Please Try again");
                        }
                }
        }

        public static String inputPattern(String msg, String pattern) {
                while (true) {
                        try {
                                System.out.println(msg);
                                System.out.println("Please enter the pattern of + " + pattern);

                                String input = inputNonBlankStr("");

                                if (!input.matches(pattern)) {
                                        System.out.println("It did not match!");
                                        throw new Exception();
                                }

                                return input;
                        } catch (Exception e) {
                                System.out.println("Please Try again");
                        }
                }
        }

        public static String inputStr(String msg) {
                System.out.println(msg);
                return sc.nextLine();
        }

}
