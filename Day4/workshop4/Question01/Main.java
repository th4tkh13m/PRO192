package workshop4.Question01;

public class Main {
    public static void main(String[] args) {
        Student khiem = new Student("Khiem", "Nowhere", "AI", 2, 0);
        Staff s = new Staff("No", "VN", "FBT", 2);
        Person p = new Person("Dao", "DN");
        System.out.println(p);
        System.out.println(khiem);
        System.out.println(s);
    }
}
