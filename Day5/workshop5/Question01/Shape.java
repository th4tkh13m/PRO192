package workshop5.Question01;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }

}
