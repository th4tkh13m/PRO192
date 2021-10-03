package workshop4.Question05;

import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        Item item = null;
        int prevChoice = 0;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Create a Vase");
            System.out.println("2. Create a statue");
            System.out.println("3. Create a painting");
            System.out.println("4. Display the item");
            System.out.println("5. Exit");
            System.out.println("Input a choice");
            choice = sc.nextInt();
        switch (choice) {
            case 1:
                item = new Vase();
                ((Vase)item).inputVase();
                prevChoice = 1;
                break;
            case 2:
                item = new Statue();
                ((Statue)item).inputStatue();
                prevChoice = 2;
                break;
            case 3:
                item = new Painting();
                ((Painting)item).inputPainting();
                prevChoice = 3;
                break;
            case 4:
                if (item == null) {
                    System.out.println("No item to display");
                }
                else {
                    if (prevChoice == 1) {
                        ((Vase)item).outputVase();
                    }
                    else if (prevChoice == 2) {
                        ((Statue)item).outputStatue();
                    }
                    else if (prevChoice == 3) {
                        ((Painting)item).outputPainting();
                    }
                }
            default:
                break;
        }
        
    } while (choice != 5);
    sc.close();
}
    
} 
    
