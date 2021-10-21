package Slide52;

public class Main {
    public static void main(String[] args) {
        // String filename = "books.dat";
        Menu menu = new Menu();
        menu.add("1. View Books");
        menu.add("2. Add new Books");
        menu.add("3. Save to File");
        menu.add("4. Read from File");
        menu.add("5. Quit");
        int choice;
        BookList bookList = new BookList();
        bookList.loadBookFromFile("books.dat");
        do {
            System.out.println("BOOK MANAGER");
            for (String option : menu) {
                System.out.println(option);
            }
            choice = menu.getUserChoice();
            switch (choice) {
                case 1:
                    bookList.print();
                    break;
                case 2:
                    bookList.addNewBook();
                    break;
                case 3:
                    bookList.saveBookToFile("books.dat");
                    break;
                case 4:
                    bookList.loadBookFromFile("books.dat");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (choice != menu.size());
    }
}
