package workshop4.Question00;

public class Programmer extends Employee {
    private int bonus = 10000;

    public Programmer() {
    }

    public Programmer(float salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }

}
