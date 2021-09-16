package CarManager;

public class Tester {
    public static void main(String[] args) {
        Car c2 = new Car("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColor("black");
        System.out.println("Colour of c2:" + c2.getColor());
        c2.output();
    }
}
