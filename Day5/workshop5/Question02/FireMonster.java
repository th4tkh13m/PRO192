package workshop5.Question02;

public class FireMonster extends Monster{

    public FireMonster(String name) {
        super(name);
    }
    
    @Override
    public String attack() {
        return "Fire Blast!";
    }
}
