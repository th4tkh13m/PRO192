package studentdemo;

public class Main {
    public static void main(String[] args) {
        Student stu01 = new Student("Paul Lee", 3.5);
        Student stu02 = new Student("Oh sad", 4.0);
        System.out.println("" + stu01.toString());
        System.out.println(("" + stu02.toString()));
        stu01.checkActivity(5);
    }
}
