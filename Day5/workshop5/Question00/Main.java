package workshop5.Question00;

public class Main {
   public static void main(String[] args) {
       Animal[] animalKingdoms = new Animal[5];
       animalKingdoms[0] = new Cat("Azusa", 111, true);
       animalKingdoms[1] = new Dog("VVD", 112, "DN");
       animalKingdoms[2] = new Duck("NULL", 113, "Bruh");
       for (Animal animal : animalKingdoms) {
           if (!(animal instanceof Cat)) {
               System.out.println(animal.toString());
               animal.sound();
           }
       }
   } 
}
