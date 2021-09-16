package StudentDemo2;

public class Student {

    private String sName;
    private String address;
    private int numCourse = 0;
    private Course[] courses;

    public Student(String sName, String address) {
        this.sName = sName;
        this.address = address;
    }

    public String getsName() {
        return sName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCourseGrade(Course course) {
        this.courses[numCourse] = course;
        this.numCourse = this.numCourse + 1;
    } 

    public void printGrade() {
        System.out.print("" + sName + " ");
        for (int i = 0; i < this.numCourse; i++) {
            System.out.println(courses[i]);
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < this.numCourse; i++) {
            sum = sum + this.courses[i].getGrade();
        }
        return sum / this.numCourse;
    }

    @Override
    public String toString() {
        return sName + "(" + address + ")";
    }

    
    
}
