package InheritantPersonProfessor;

public class Main {
    public static void main(String[] args) {
        Student khiem = new Student("Khiem", "Nowhere", "no", "DE160076", "AI", "Bachelor");
        System.out.println(khiem);
        Professor p = new Professor("Tran", "VN", "NA", "IT");
        System.out.println(p);
    }
}
