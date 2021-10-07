package workshop5.Question02;

public class StoneMonster extends Monster{

    public StoneMonster(String name) {
        super(name);
    }
    
    @Override
    public String attack() {
        return "Rock Tomb";
    }
}
