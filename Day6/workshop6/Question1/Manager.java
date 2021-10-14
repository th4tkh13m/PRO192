package workshop6.Question1;

public class Manager {
    public static int menu() {
        System.out.println("WELCOME TO STUDENT MANAGER");
        System.out.println("1. Create Student");
        System.out.println("2. Find and Sort Student list");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report Student List");
        System.out.println("5. Exit");
        return Validator.checkInputLimit(1, 5);
    }
}
