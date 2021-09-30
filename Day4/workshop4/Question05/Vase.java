package workshop4.Question05;

import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void outputVase() {
        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
    }

    public void inputVase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Material: " + material);
        System.out.println("Input Height: " + height);
        sc.close();
    }
}
