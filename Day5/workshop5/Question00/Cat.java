package workshop5.Question00;

public class Cat extends Animal {
    private boolean isDrinkMilk;

    public Cat() {
    }

    public Cat(String name, int id, boolean isDrinkMilk) {
        super(name, id);
        this.isDrinkMilk = isDrinkMilk;
    }

    @Override
    public void sound() {
        System.out.println("Nyan Nyan");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "DrinkMilk:" + isDrinkMilk + "]";
    }
}
