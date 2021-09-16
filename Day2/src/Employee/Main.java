package Employee;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Employee musk = new Employee(123, "Elon", "Musk", 1000000);
        System.out.println("" + musk);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String salaryDisplay = formatter.format(musk.getAnnualSalary());
        System.out.println("Annual Salary: " + salaryDisplay);
        String raiseDisplay = formatter.format(musk.raiseSalary(5));
        System.out.println("Raising salary: " + raiseDisplay);
    }
}
