package workshop6.Question1;

public class Student implements Comparable<Student> {
    protected String id;
    protected String studentName;
    protected String semester;
    protected String courseName;

    public Student() {
    }

    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public int compareTo(Student o) {
        return o.studentName.compareTo(this.studentName);
    }

    public Student addStudent() {
        System.out.println("Please enter student ID:");
        id = Validator.checkInputString();
        System.out.println("Input student name:");
        studentName = Validator.checkInputString();
        System.out.println("Input semester:");
        semester = Validator.checkInputString();
        System.out.println("Input course name:");
        courseName = Validator.checkInputCourse();
        Student student = new Student(id, studentName, semester, courseName);
        return student;
    }

    @Override
    public String toString() {
        return "Student [courseName=" + courseName + ", id=" + id + ", semester=" + semester + ", studentName="
                + studentName + "]";
    }

}
