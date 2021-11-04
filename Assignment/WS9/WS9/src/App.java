import java.util.ArrayList;

import Com.Menu;
import Data.StudentList;

public class App {
    public static void main(String[] args) throws Exception {
        StudentList studentList = new StudentList();
        Menu<String> menu = new Menu<>();

        ArrayList<String> opList = new ArrayList<>();
        opList.add("Add new Student");
        opList.add("Search a Student");
        opList.add("Update name and mark");
        opList.add("Delete a Student");
        opList.add("Show all Students");
        opList.add("Exit");

        int choice;

        while (true) {
            choice = menu.getChoice(opList);
            switch (choice) {
            case 1:
                studentList.addStudent();
                break;
            case 2:
                studentList.searchStudent();
                break;
            case 3:
                studentList.updateStudent();
                break;
            case 4:
                studentList.removeStudent();
                break;
            case 5:
                studentList.printAll();
                break;
            case 6:
                System.exit(0);
                break;
            }

        }
    }
}
