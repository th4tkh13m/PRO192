package workshop1Demos;

public class MenuMain {
    public static void main(String[] args) {
        int choice;
        while(true) {
            choice = Menu.menuChoice();
            switch (choice) {
                case 1:
                    System.out.println("This is task 1. It does nothing!");
                    break;
                case 2:
                    System.out.println("This is task 2. It does nothing. You can't read, right?");
                    break;
                case 3:
                    System.out.println("Bingo. You chose task 3. Exiting...");
                    return;
                case 4:
                    System.out.println("You chose task 4. Foolish.");
                    break;
                default:
                    System.out.println("You cannot enter a correct task. What a shame.");
                    break;
            }   
        }
    }    
}
