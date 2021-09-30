package workshop4.Question05;

import java.util.Scanner;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterColor;
    private boolean isFrame;
    public Painting() {
    }
    public Painting(int value, String creator, int height, int width, boolean isWaterColor, boolean isFrame) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColor = isWaterColor;
        this.isFrame = isFrame;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public boolean isWaterColor() {
        return isWaterColor;
    }
    public void setWaterColor(boolean isWaterColor) {
        this.isWaterColor = isWaterColor;
    }
    public boolean isFrame() {
        return isFrame;
    }
    public void setFrame(boolean isFrame) {
        this.isFrame = isFrame;
    }
    public void outputPaiting() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("isWaterColor: "+isWaterColor);
        System.out.println("isFrame: "+isFrame);
    }

    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Height: " + height);
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Input Width: " + width);
        width = sc.nextInt();
        sc.nextLine();
        System.out.println("Input isWaterColor: " + isWaterColor);
        isWaterColor = sc.nextBoolean();
        System.out.println("Input isFrame: " + isFrame);
        isFrame = sc.nextBoolean();
        sc.close();
    }
}