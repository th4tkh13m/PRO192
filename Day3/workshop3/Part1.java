package workshop3;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        boolean cont = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                double num;
                num = sc.nextDouble();
                if (num < 1) {
                    throw new Exception();
                }
                System.out.println("The number is:" + num);
                cont = false;
                sc.close();
        }
            catch (Exception e) {
                System.out.println("Invalid number");
                cont = true;
                
            }
        } while (cont);
    }
}
