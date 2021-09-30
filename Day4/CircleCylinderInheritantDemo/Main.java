package CircleCylinderInheritantDemo;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "RED");
        System.out.println("" + circle);
        System.out.printf("%.2f", circle.getArea());
        System.out.println("");
        Cylinder cylinder = new Cylinder(9, "YELLOW", 6);
        System.out.println("" + cylinder);
        System.out.printf("%.2f", cylinder.getArea());
    }

}
