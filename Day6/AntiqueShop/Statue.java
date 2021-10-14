package AntiqueShop;

import java.util.Scanner;

public class Statue extends Item{
    private int weight;
    private String color;
    public Statue() {
    }
    public Statue(int value, String creator, int weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void outputStatue() {
        output();
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }

    public void inputStatue() {
        input();
        Scanner sc = new Scanner(System.in);
        color = Validator.getString(sc, "Input color: ");
        weight = Validator.getInt(sc, "Input weight: ");
        // sc.close();
    }
}