package workshop3.Shopping;

import java.util.Scanner;

public class LineItem {

    private Product product;
    private int qty;

    public LineItem() {
    }

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    // public LineItem addLineItem() {
    //     Scanner sc = new Scanner(System.in);
    //     String pName;
        
    // }

    public double getTotal() {
        double totalPrice;
        totalPrice = product.getPrice() * this.qty;
        return totalPrice;
    }    

}
