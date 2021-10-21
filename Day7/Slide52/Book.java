package Slide52;

import java.io.Serializable;

public class Book implements Serializable{
    private String title;
    private int price;
    public Book() {
    }
    
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void print() {
        System.out.println("Title: " + title + "\nPrice: " + price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
