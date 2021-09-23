package workshop3.Shopping;

import java.util.Scanner;

public class Cart {
    private String customerName;
    private LineItem[] cart;
    
    public Cart() {
    }

    public void addCart(int numLineItem) {
        cart = new LineItem[numLineItem];
        Scanner sc = new Scanner(System.in);
        this.customerName = sc.nextLine();
        for (int i = 0; i < numLineItem; i++) {
            System.out.println("Enter the " + i + "th item:");
            cart[i] = new LineItem();
        }
    }

    public double getAllPayment() {
        double allPayment = 0;
        for (int i = 0; i < 2; i++) {
            allPayment = allPayment + cart[i].getTotal();
        }
        return allPayment;
    }

    
}
