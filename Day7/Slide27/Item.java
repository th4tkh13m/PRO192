package Slide27;

public class Item {
    private String code, name;
    private int price;
    public Item(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("CODE: " + code);
        System.out.println("NAME: " + name);
        System.out.println("PRICE: " + price);
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
}
