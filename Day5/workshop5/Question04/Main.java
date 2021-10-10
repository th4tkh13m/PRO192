package workshop5.Question04;

public class Main {
   public static void main(String[] args) {
       Rectangle r1 = new Rectangle(10, 20);
       System.out.println(r1);
       System.out.println(r1.getArea());
       System.out.println(r1.getPerimeter());

       Circle c1 = new Circle(5);
       System.out.println(c1);
       System.out.println(c1.getArea());
       System.out.println(c1.getPerimeter());
   } 
}
