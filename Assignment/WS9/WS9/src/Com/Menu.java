package Com;

import java.util.ArrayList;

public class Menu<E> {
    
    public int getChoice(ArrayList<E> optList) {
        int choice;
        for (int i = 0; i < optList.size(); i++) {
            System.out.println(i + 1 + ". " + optList.get(i));
        }
        choice = Inputter.inputInt("Enter your choice", 1, optList.size());
        return choice;
    }

}
