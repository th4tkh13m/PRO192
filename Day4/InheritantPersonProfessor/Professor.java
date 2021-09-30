package InheritantPersonProfessor;

public class Professor extends Person {
    private String department;

    public Professor() {
    }

    public Professor(String name, String address, String birthday, String department) {
        super(name, address, birthday);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Professor [" + super.toString() + "department=" + department + "]";
    }

}
