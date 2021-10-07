package workshop5.Question02;

public class Tester {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Charmander"); 
        Monster m2 = new WaterMonster("Squirtle"); 
        Monster m3 = new StoneMonster("Geodude"); 
        
        System.out.println(m1.attack()); 
        
        System.out.println(m2.attack()); 
        
        System.out.println(m3.attack()); 
        
        m1 = new StoneMonster("Tester"); 
        System.out.println(m1.attack()); 
        
        Monster m4 = new Monster("Hooman");
        System.out.println(m4.attack()); 
        
    }
}
