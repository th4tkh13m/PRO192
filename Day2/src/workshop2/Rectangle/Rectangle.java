package workshop2.Rectangle;

import java.util.Scanner;

public class Rectangle {
    private static Scanner sc = new Scanner(System.in);
    private double width;
    private double height;

    public void input() {
        System.out.println("Enter width:");
        this.width = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter height:");
        this.height = sc.nextDouble();
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public void display() {
        System.out.println("Width:" + this.width);
        System.out.println("Height:" + this.height);
        System.out.println("Area:" + this.calculateArea());
        System.out.println("Perimeter:" + this.calculatePerimeter());
    }
}
