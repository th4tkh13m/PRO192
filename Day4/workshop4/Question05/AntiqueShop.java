package workshop4.Question05;

import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Create a Vase");
            System.out.println("2. Create a statue");
            System.out.println("3. Create a painting");
            System.out.println("4. Display the item");
            System.out.println("Input a choice");
            choice = sc.nextInt();
        } while ((choice <= 0) && (choice > 4));
        switch (choice) {
            case 1:
                item = new Vase();
                ((Vase)item).inputVase();
                ((Vase)item).outputVase();
                break;
            case 2:
                item = new Statue();
                ((Statue)item).inputStatue();
                ((Statue)item).outputStatue();
                break;
            case 3:
                item = new Painting();
                ((Painting)item).inputPainting();
                ((Painting)item).outputPainting();
                break;
            case 4:

            default:
                break;
        }
        sc.close();
    }
    
} 
    
