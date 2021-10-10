package workshop5.Question07;

import java.util.Scanner;

public class ProductApp {
    public static void main(String args[]) {
        System.out.println("Weclome to the Product Selector");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String productCode = sc.next(); 
            sc.nextLine(); 
            Product p = ProductDB.getProduct(productCode);

            System.out.println();
            if (p != null)
                System.out.println(p.toString());
            else
                System.out.println("No product matches this product code.\n");
            System.out.println("Product count: " + Product.getCount() + "\n");

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    } 
}
