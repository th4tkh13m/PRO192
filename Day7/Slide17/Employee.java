package Slide17;

public class Employee implements Comparable<Employee>{
    private String code;
    private String name;
    private int salary;
    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }
    public void print() {
        System.out.println("CODE" + code);
        System.out.println("NAME: " + name);
        System.out.println("SALARY: " + salary);
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee o) {
        return this.getCode().compareTo(o.getCode());
    }

    
}
