package workshop5.Question06;

public class Tester {
    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "land", "honey");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        
        University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role df = new BeeColony(3000, "land", "wasp");
        System.out.println(df);
        df.createWorker();
    }
}
