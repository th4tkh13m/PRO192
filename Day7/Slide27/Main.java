package Slide27;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("1. Add new Item");
        menu.add("2. Remove an Item");
        menu.add("3. Update an Item price");
        menu.add("4. Print Item list");
        menu.add("5. Save to file");
        menu.add("6. Quit");

        int choice;
        ItemList itemList = new ItemList();
        itemList.addFromFile("Item.txt");
        System.out.println("ITEM MANAGER");
        do {
            for (String option : menu) {
                System.out.println(option);
            }
            choice = menu.getUserChoice();
            switch (choice) {
            case 1:
                itemList.addItem();
                break;
            case 2:
                itemList.removeItem();
                break;
            case 3:
                itemList.updatePrice();
                break;
            case 4:
                itemList.print();
                break;
            case 5:
                itemList.saveToFile("Item.txt");
                break;
            case 6:
                return;
            default:
                System.out.println("Invalid");
                break;

            }
        } while (choice != 6);
    }
}
