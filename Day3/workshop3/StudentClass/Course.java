package workshop3.StudentClass;

public class Course {

    private String cName;
    private double grade;

    public Course() {
    }

    public Course(String cName, double grade) {
        this.cName = cName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getcName() {
        return cName;
    }

    @Override
    public String toString() {
        return "Course [course=" + cName + ", grade=" + grade + "]";
    }
}
