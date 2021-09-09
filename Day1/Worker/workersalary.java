package Worker;

import java.util.Scanner;

public class workersalary {
    public static void main(String[] args) {
        double sale;
        double work_hour;
        double salary;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sale, you broke: ");
        sale = input.nextInt();
        input.nextLine();
        System.out.println("Emter your work hour, you lazy: ");
        work_hour = input.nextInt();
        salary = sale;

        if (sale > 5000) {
            salary = salary * 1.1;
        }
        if (work_hour > 40) {
            salary = salary + +work_hour * 14.5 + (work_hour - 40) * 14.5 * 2;
        } else {
            salary = salary + work_hour * 14.5;
        }

        input.close();
        System.out.println("salary = " + salary);
    }
}
