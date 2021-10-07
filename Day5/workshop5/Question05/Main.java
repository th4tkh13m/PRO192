package workshop5.Question05;

public class Main {
   public static void main(String[] args) {
       Circle c1 = new Circle(10);
       System.out.println("Perimeter: " + c1.getPerimeter());
       System.out.println("Area: " + c1.getArea());
       System.out.println(c1);

       ResizableCircle c2 = new ResizableCircle(15);
       System.out.println("Perimeter: "+ c2.getPerimeter());
       System.out.println("Area: "+ c2.getArea());
       c2.resize(50);
       System.out.println("Perimeter: "+ c2.getPerimeter());
       System.out.println("Area: "+ c2.getArea());
   } 
}
