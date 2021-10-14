package AntiqueShop;

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
    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("isWaterColor: "+isWaterColor);
        System.out.println("isFrame: "+isFrame);
    }

    public void inputPainting() {
        input();
        Scanner sc = new Scanner(System.in);
        height = Validator.getInt(sc, "Input Height: ");
        width = Validator.getInt(sc, "Input Width: ");
        isWaterColor = Validator.getBoolean(sc, "Input isWaterColor: ");
        isFrame = Validator.getBoolean(sc, "Input isFrame: ");
    }
}