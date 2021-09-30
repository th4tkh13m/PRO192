package workshop4.Question02;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    @Override
    public String toString() {
        return "Square [" + super.toString() + "]";
    }

}
