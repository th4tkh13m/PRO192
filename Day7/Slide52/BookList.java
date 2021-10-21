package Slide52;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BookList extends ArrayList<Book> {
    Scanner sc = new Scanner(System.in);

    public void loadBookFromFile(String fname) {
        if (this.size() > 0) {
            this.clear();
        }
        try {
            File file = new File(fname);
            if (!file.exists())
                return;
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream fo = new ObjectInputStream(fi);
            Book book;
            while ((book = (Book) (fo.readObject())) != null) {
                this.add(book);
            }
            fo.close();
            fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveBookToFile(String fname) {
        if (this.size() == 0) {
            System.out.println("No book to save");
            return;
        }
        try {
            FileOutputStream fi = new FileOutputStream(fname);
            ObjectOutputStream fo = new ObjectOutputStream(fi);
            for (Book book : this) {
                fo.writeObject(book);
            }
            fo.close();
            fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addNewBook() {
        String title;
        int price;
        System.out.println("Input Book's title: ");
        title = sc.nextLine();
        System.out.println("Input Book's price: ");
        price = Integer.parseInt(sc.nextLine());
        this.add(new Book(title, price));
    }

    public void print() {
        if (this.size() == 0) {
            System.out.println("No Book");
        } else {
            System.out.println("BOOK LIST");
            for (Book book : this) {
                book.print();
            }
        }
    }
}
