package workshop3.Shopping;

public class Cart {
    private String customerName;
    private LineItem[] cart = new LineItem[50];
    
    public Cart() {
    }

    public void addCart(int numLineItem) {
        try {
            if (numLineItem > 50) 
                throw new Exception();
            
        } catch (Exception e) {
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
