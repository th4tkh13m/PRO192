package workshop3.StudentClass;

import java.util.Scanner;

public class Student {

    public static Scanner in = new Scanner(System.in);
    private String sName;
    private String sID;
    private int numCourse = 0;
    private Course[] courses;

    public Student(String sName, String sID) {
        this.sName = sName;
        this.sID = sID;
    }

    public Student(String sName, String sID, int numCourse, Course[] courses) {
        this.sName = sName;
        this.sID = sID;
        this.numCourse = numCourse;
        this.courses = courses;
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public void addCourseGrade() {
        String cName;
        double grade;
        this.courses = new Course[numCourse];
        System.out.println("Please enter the information of the courses: ");
        for (int i = 0; i < numCourse; i++) {
            System.out.print("Enter course name: ");
            cName = Student.in.nextLine();
            System.out.print("Enter grade: ");
            grade = Student.in.nextDouble();
            Student.in.nextLine();
            Course tempCourse = new Course(cName, grade);
            courses[i] = tempCourse;
        }

    }

    public void printGrade() {
        System.out.print("" + sName + " ");
        for (int i = 0; i < this.numCourse; i++) {
            System.out.println(courses[i]);
        }
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < this.numCourse; i++) {
            sum = sum + this.courses[i].getGrade();
        }
        return sum / this.numCourse;
    }

    @Override
    public String toString() {
        return sName + "(" + sID + ")";
    }
}