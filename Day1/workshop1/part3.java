package workshop1;

import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {

        String[] sName;
        int n; // Number of students.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = input.nextInt();
        input.nextLine();
        sName = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "th student's name:");
            sName[i] = input.nextLine();
            sName[i] = sName[i].substring(0,1).toUpperCase() 
                        + sName[i].substring(1);
        }

        System.out.println("\nThe formatted names: ");
        for (int i = 0; i < n; i++) {
            System.out.println(sName[i]);
        }

        input.close();
    }
}
