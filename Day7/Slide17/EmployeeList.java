package Slide17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
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
                StringTokenizer tokenizer = new StringTokenizer(content, ",");
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
                printWriter.println(employee.getCode() + "," + employee.getName() + "," + employee.getSalary());
            }
            printWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }



    private int findCode(String code) {
        for (Employee employee : this) {
            if (employee.getCode() == code) {
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
            valid = code.matches("^E\\d(3)$");
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

}
