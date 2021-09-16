package StudentDemo2;

public class Course {
   
    

    private String cName;
    private int grade;

    public Course(String cName, int grade) {
        this.cName = cName;
        this.grade = grade;
    }

    public int getGrade() {
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
