package SortDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(111, "Bruh", "UK"));
        products.add(new Product(222, "Super Idol", "CN"));   
        products.add(new Product(333, "dark", "US"));
        products.add(new Product(444, "LMAO", "VN"));
        products.add(new Product(555, "Skreeet", "no"));

        System.out.println("Before sort: ");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\nAfter sort: ");
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("---------------");
        Collections.reverse(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
