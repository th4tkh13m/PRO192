package Slide17;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("1. Add new employee");
        menu.add("2. Remove an employee");
        menu.add("3. Promoting an employee");
        menu.add("4. Print employee list");
        menu.add("5. Save to file");
        menu.add("6. Quit");

        int choice;
        EmployeeList employeeList = new EmployeeList();
        employeeList.addFromFile("employee.txt");
        System.out.println("EMPLOYEE MANAGER");
        do {
            for (String option : menu) {
                System.out.println(option);
            }
            choice = menu.getUserChoice();
            switch (choice) {
            case 1:
                employeeList.addEmployee();
                break;
            case 2:
                employeeList.removeEmployee();
                break;
            case 3:
                employeeList.promote();
                break;
            case 4:
                employeeList.print();
                break;
            case 5:
                employeeList.saveToFile("employee.txt");
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
