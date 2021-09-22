package workshop2.Fraction;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction a = new Fraction(20, 10);
        Fraction b = new Fraction(10, 20);
    
        System.out.println(a);
        System.out.println(b); 
        System.out.println(a.add(b));
        
        Fraction c = new Fraction(30, 3);
        System.out.println(c);
        System.out.println(c.subtract(a));
        System.out.println(c.multiply(a));
        System.out.println(c.divide(b));
    }
    

}
