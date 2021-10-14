package workshop6.Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    private List<Student> lStudents = new ArrayList<>();

    public StudentList() {
    }

    public void createStudent() {
        while (true) {
            Student student = new Student().addStudent();
            if (Validator.checkIDExist(lStudents, student.getId()) == -1) {
                lStudents.add(student);
            } else {
                System.out.println("This ID is existed!");
            }
            System.out.println("Do you want to continue?");
            if (!Validator.checkInputYN()) {
                break;
            }
        }
    }

    public void findAndSort() {
        if (!lStudents.isEmpty()) {
            List<Student> findNameList = new ArrayList<>();
            List<String> nameList = new ArrayList<>();
            while (true) {
                System.out.println("Enter the student's name");
                String name = Validator.checkInputString();
                if (!nameList.contains(name)) {
                    nameList.add(name);
                } else {
                    System.out.println(name + "is already chosen!");
                }
                System.out.println("Do you want to continue?");
                if (!Validator.checkInputYN()) {
                    break;
                }
            }
            for (String name : nameList) {
                for (Student student : lStudents) {
                    if (student.getStudentName().contains(name)) {
                        findNameList.add(student);
                    }
                }
            }
            if (findNameList.isEmpty()) {
                System.out.println("404 Not found.");
            } else {
                for (Student student : findNameList) {
                    System.out.println(student);
                }
            }
			Collections.sort(findNameList);
        } else {
            System.out.println("There is no student!");
        }
    }

    public void updateOrDelete() {
        if (!lStudents.isEmpty()) {
            while (true) {
                System.out.println("Enter ID to update/delete: ");
                String id = Validator.checkInputString();
                int index = Validator.checkIDExist(lStudents, id);
                if (index != -1) {
                    char choice = Validator.checkInputUD();
                    if (choice == 'u') {
                        lStudents.set(index, new Student().addStudent());
                    } else if (choice == 'd') {
                        lStudents.remove(index);
                    }
                } else {
                    System.out.println("The entered ID is existed!");
                }
                System.out.println("Do you want to continue?");
                if (!Validator.checkInputYN()) {
                    break;
                }
            }
        }
    }

    public void report() {
        System.out.println("Student Report: ");
        for (Student student : lStudents) {
            System.out.println(student);
        }
    }

    public List<Student> getlStudents() {
        return lStudents;
    }

    public void setlStudents(List<Student> lStudents) {
        this.lStudents = lStudents;
    }

}
