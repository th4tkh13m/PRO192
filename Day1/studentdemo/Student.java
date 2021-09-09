package studentdemo;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void goToUni() {
        System.out.println("Go to Uni every morning");
    }

    public void hobbies() {
        System.out.println("Vovinam");
    }

    public void takingFinalExam() {
        System.out.println("Taking the online exam. Bruh");
    }

    public void checkActivity(int time) {
        if (time == 5) {
            this.takingFinalExam();
        }
    }

    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
}
