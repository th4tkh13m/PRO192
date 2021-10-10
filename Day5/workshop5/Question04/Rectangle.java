package workshop5.Question04;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
