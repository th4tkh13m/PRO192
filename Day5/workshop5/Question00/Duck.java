package workshop5.Question00;

public class Duck extends Animal{
    private String colour;

    public Duck() {
    }

    public Duck(String colour, int id, String name) {
        super(name, id);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void sound() {
        System.out.println("Duck Duck");
    }

    @Override
    public String toString() {
        return "Duck[" + super.toString() + "colour=" + colour + ']';
    }
}
