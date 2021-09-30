package InheritantPersonProfessor;

public class Student extends Person {
    private String sID;
    private String major;
    private String degree;

    public Student() {
    }

    public Student(String name, String address, String birthday, String sID, String major, String degree) {
        super(name, address, birthday);
        this.sID = sID;
        this.major = major;
        this.degree = degree;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + "degree=" + degree + ", major=" + major + ", sID=" + sID + "]";
    }

}
