package workshop5.Question00;

public class Dog extends Animal {
    private String home;

    public Dog() {
    }

    public Dog(String name, int id, String home) {
        super(name, id);
        this.home = home;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "home=" + home + "]";
    }
}
