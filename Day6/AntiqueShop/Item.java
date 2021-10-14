package AntiqueShop;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Creator:");
        creator = sc.nextLine();
        System.out.println("Enter value:");
        value = sc.nextInt();

    }

    public void output() {
        System.out.println("Creator: " + creator);
        System.out.println("Value: " + value);
    }
}