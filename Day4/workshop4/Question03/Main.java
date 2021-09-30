package workshop4.Question03;

public class Main {
    public static void main(String[] args) {
        Animal khiem = new Animal("Khiem");
        Mammal perry = new Mammal("perry");
        Cat john = new Cat("john");
        Dog buck = new Dog("buck");

        // Tests
        System.out.println(khiem);
        System.out.println(perry);
        System.out.println(john);
        System.out.println(buck);

        john.greets();
        buck.greets();
        Dog nice = new Dog("Nice");
        buck.greets(nice);
    }
}
