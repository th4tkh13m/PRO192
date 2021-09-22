package workshop2.Student;

import java.util.Date;

public class Student {

    private String name;
    private String studentId;
    private Date birthDate;
    private String address;
    private String major;
    private double gpa;

    public Student(String name, String studentId, Date birthDate, String address, String major, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printAllAttributes() {
        System.out.println("Student Name:" + name);
        System.out.println("Student ID:" + studentId);
        System.out.println("Student Birthday:" + birthDate);
        System.out.println("Student address:" + address);
        System.out.println("Student major:" + major);
        System.out.println("Student gpa:" + gpa);
    }
}
