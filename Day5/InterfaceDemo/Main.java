package InterfaceDemo;

public class Main {
   public static void main(String[] args) {
       Shape r = new Rectangle(10, 0.1);
       System.out.println(r);
       System.out.println(r.getArea());

       Shape t = new Triangle(0.1, 10);
       System.out.println(t);
       System.out.println(t.getArea());
   } 
}
