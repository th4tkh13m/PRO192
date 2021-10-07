package workshop5.Question00;

public class Animal {
    protected String name;
    protected int id;

    public Animal() {
    }

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void sound() {
        System.out.println("Animal Sound");
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", name=" + name + "]";
    }

}
