package Slide27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemList extends ArrayList<Item>{
    Scanner sc = new Scanner(System.in);

    public ItemList() {
    }

    public void addFromFile(String fname) {
        if (this.size() > 0) {
            this.clear();
        }
        try {
            File file = new File(fname);
            if (!file.exists()) {
                return;
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String code, name, priceString;
            int price;
            while ((code = bufferedReader.readLine()) != null &&
                    (name = bufferedReader.readLine()) != null &&
                    (priceString = bufferedReader.readLine()) != null) {
                price = Integer.parseInt(priceString);
                Item Item = new Item(code, name, price);
                this.add(Item);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String fname) {
        if (this.size() == 0) {
            System.out.println("No Item");
            return;
        }
        try {
            File file = new File(fname);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Item Item : this) {
                printWriter.println(Item.getCode() + "\n" + Item.getName() + "\n" + Item.getPrice());
                printWriter.flush();
            }
            printWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }



    private int findCode(String code) {
        for (Item Item : this) {
            if (Item.getCode().equals(code)) {
                return this.indexOf(Item);
            }
        }
        return -1;
    }


    public void addItem() {
        String code, name;
        int  price;
        int index;
        boolean valid = true;
        System.out.println("Enter information");
        do {
            System.out.println("Enter code (Iddd) (d stands for digit)");
            code = sc.nextLine().toUpperCase();
            index = findCode(code);
            valid = code.matches("^I\\d{3}$");
            if (index >= 0) {
                System.out.println("Duplicated code");
            }
            if (!valid) {
                System.out.println("Invalid code");
            }
        } while (index >= 0 || (!valid));
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter price");
        price = Integer.parseInt(sc.nextLine());
        this.add(new Item(code, name, price));
        System.out.println("Add succesfully");
    }
    public void removeItem() {
        String code;
        System.out.println("Enter the code you want to remove");
        boolean valid = true;
        code = sc.nextLine().toUpperCase();
        do {
            valid = code.matches("^I\\d{3}$");
        } while (!valid);
        int index = findCode(code);
        if (index >= 0) {
            this.remove(index);
            System.out.println("Remove successfully");
        } else {
            System.out.println("404");
        }
    }

    public void updatePrice() {
        String code;
        System.out.println("Enter the code of promoted Item: ");
        code = sc.nextLine().toUpperCase();
        int index = findCode(code);
        if (index < 0) {
            System.out.println("No such Item");
        }
        else {
            System.out.println("Old price: " + this.get(index).getPrice());
            int newprice;
            do {
                System.out.println("Enter new price (must be greater than old one)");
                newprice = Integer.parseInt(sc.nextLine());
            } while (newprice <= this.get(index).getPrice());
            this.get(index).setPrice(newprice);
            System.out.println("price has been set to " + newprice);
        }
    }

    public void print() {
        if (this.size() == 0) {
            System.out.println("Empty");
            return;
        }
        System.out.println("Item list");
        for (Item Item : this) {
            Item.print();
        }
    }
}
