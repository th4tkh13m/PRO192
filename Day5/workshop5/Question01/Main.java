package workshop5.Question01;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape("Blue");
        System.out.println(s1.getArea());
        System.out.println(s1);

        Shape s2 = new Rectangle("Blue", 2, 3);
        System.out.println(s2.getArea());
        System.out.println(s2);

        Shape s3 = new Triangle("Blue", 4, 5);
        System.out.println(s3.getArea());
        System.out.println(s3);

    }
}
