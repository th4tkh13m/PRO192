package studentdetails;

import java.util.Scanner;

public class StudentDetails {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        int year;
        String address;
        char gender;
        boolean isVaccine;
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter year: ");
        year = input.nextInt();
        input.nextLine();
        System.out.println("Enter address: ");
        address = input.nextLine();
        System.out.println("Enter gender: ");
        gender = input.nextLine().charAt(0);
        System.out.println("Enter Vaccinate condition: ");
        isVaccine = input.nextBoolean();

        System.out.println("" + name + " " + year + " " + address + " " + gender + " " + isVaccine + " ");
    }
}
