package workshop1;

import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        num1 = input.nextFloat();
        input.nextLine();
        System.out.println("Input the second number; ");
        num2 = input.nextFloat();
        input.nextLine();
        System.out.println("Enter the operator: (+-*/) ");
        op = input.nextLine();
        
        switch (op) {
            case "+":
                System.out.println(("Result of " + num1 + op + num2
                                    + "=" + (num1 + num2)));
                break;
            case "-":
                System.out.println(("Result of " + num1 + op + num2
                                    + "=" + (num1 - num2)));
                break; 
            case "*":
                System.out.println(("Result of " + num1 + op + num2
                                    + "=" + (num1 * num2))); 
                break;
            case "/":
                System.out.println(("Result of " + num1 + op + num2
                                    + "=" + (num1 / num2))); 
                break;
            default:
                System.out.println("No such operator");
        }

        input.close();
    }
}
