package Slide17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EmployeeList extends ArrayList<Employee> {
    Scanner sc = new Scanner(System.in);

    public EmployeeList() {
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
            String content;
            while ((content = bufferedReader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(content, ", ");
                String code = tokenizer.nextToken();
                String name = tokenizer.nextToken();
                int salary = Integer.parseInt(tokenizer.nextToken());

                Employee employee = new Employee(code, name, salary);
                this.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String fname) {
        if (this.size() == 0) {
            System.out.println("No employee");
            return;
        }
        try {
            File file = new File(fname);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Employee employee : this) {
                printWriter.println(employee.getCode() + ", " + employee.getName() + ", " + employee.getSalary());
            }
            printWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }



    private int findCode(String code) {
        for (Employee employee : this) {
            if (employee.getCode().equals(code)) {
                return this.indexOf(employee);
            }
        }
        return -1;
    }


    public void addEmployee() {
        String code, name;
        int  salary;
        int index;
        boolean valid = true;
        System.out.println("Enter information");
        do {
            System.out.println("Enter code (Eddd) (d stands for digit)");
            code = sc.nextLine().toUpperCase();
            index = findCode(code);
            valid = code.matches("^E\\d{3}$");
            if (index >= 0) {
                System.out.println("Duplicated code");
            }
            if (!valid) {
                System.out.println("Invalid code");
            }
        } while (index >= 0 || (!valid));
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter salary");
        salary = Integer.parseInt(sc.nextLine());
        this.add(new Employee(code, name, salary));
        System.out.println("Add succesfully");
    }
    public void removeEmployee() {
        String code;
        System.out.println("Enter the code you want to remove");
        boolean valid = true;
        code = sc.nextLine().toUpperCase();
        do {
            valid = code.matches("^E\\d{3}$");
        } while (!valid);
        int index = findCode(code);
        if (index >= 0) {
            this.remove(index);
            System.out.println("Remove successfully");
        } else {
            System.out.println("404");
        }
    }

    public void promote() {
        String code;
        System.out.println("Enter the code of promoted employee: ");
        code = sc.nextLine().toUpperCase();
        int index = findCode(code);
        if (index < 0) {
            System.out.println("No such employee");
        }
        else {
            System.out.println("Old salary: " + this.get(index).getSalary());
            int newSalary;
            do {
                System.out.println("Enter new salary (must be greater than old one)");
                newSalary = Integer.parseInt(sc.nextLine());
            } while (newSalary <= this.get(index).getSalary());
            this.get(index).setSalary(newSalary);
            System.out.println("Salary has been set to " + newSalary);
        }
    }

    public void print() {
        if (this.size() == 0) {
            System.out.println("Empty");
            return;
        }
        Collections.sort(this);
        System.out.println("Employee list");
        for (Employee employee : this) {
            employee.print();
        }
    }
}
