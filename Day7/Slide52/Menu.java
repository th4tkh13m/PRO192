package Slide52;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList<String>{

    public Menu() {
    }
    
    public int getUserChoice() {
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            try {
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
