package Employee;

public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.getSalary() * 12;
    }

    public int raiseSalary(int percent) {
        return this.getSalary() * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Employee [firstname=" + firstname + ", id=" + id + ", lastname=" + lastname + ", salary=" + salary
                + "]";
    }
}
