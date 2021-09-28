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

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public double getTotal() {
        double totalPrice;
        totalPrice = this.getProduct().getPrice() * this.getQty();
        return totalPrice;
    }

}
