package workshop1Demos;

public class WhoWantToBeMillionaire {
    public static void main(String[] args) {
        char answer = 'C';
        System.out.println("What is the purpose of this code?");
        System.out.println("You marked " + answer + ". Let's see whether you are right!");
        
        if (answer == 'C') {
            System.out.println("You were right. You won $1.");
        } 
        else {
            System.out.println("Sorry, the right answer is it has no purpose, aka the teacher did not give us the question. Noob.");
        }
    }
}
