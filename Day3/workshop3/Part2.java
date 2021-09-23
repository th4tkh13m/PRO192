package workshop3;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        boolean cont = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                String s = "";
                String pattern = "(SE)\\d{3}";
                System.out.println("Enter the string:");
                s = sc.nextLine();
                if (! s.matches(pattern)) {
                    throw new Exception();
                }
                System.out.println("The string is: " + s);
                cont = false;
                sc.close();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
