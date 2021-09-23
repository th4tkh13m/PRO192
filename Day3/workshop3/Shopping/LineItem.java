package workshop3.Shopping;

public class LineItem {

    private Product product;
    private int qty;

    public LineItem() {
    }

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public double getTotal() {
        double totalPrice;
        totalPrice = product.getPrice() * this.qty;
        return totalPrice;
    }    

}
