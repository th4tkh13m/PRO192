package workshop6.Question1;

public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        int choice;
        while (true) {
            choice = Manager.menu();

            switch (choice) {
                case 1:
                    list.createStudent();
                    break;
                case (2):
                    list.findAndSort();
                    break;
                case (3):
                    list.updateOrDelete();
                    break;
                case (4):
                    list.report();
                    break;
                case (5):
                    return;
            }
        }
    }
}
