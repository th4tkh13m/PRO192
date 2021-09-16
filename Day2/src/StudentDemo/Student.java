package StudentDemo;

import java.util.Scanner;

public class Student {

    Scanner in = new Scanner(System.in);

    private String code;
    private String name;
    private int bYear;
    private String address;

    public Student() {

    }

    public void input() {
        System.out.println("Enter code: ");
        code = in.nextLine();
        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter year: ");
        bYear = in.nextInt();
        in.nextLine();
        System.out.println("Enter address: ");
        address = in.nextLine();
    }

    public void output() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Year: " + bYear);
        System.out.println("Address: " + address);
    }
}
