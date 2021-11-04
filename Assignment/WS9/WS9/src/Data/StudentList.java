package Data;

import java.util.ArrayList;

import Com.Inputter;

/**
 * StudentList
 */
public class StudentList extends ArrayList<Student> {

    public StudentList() {
    }

    public int searchID(String code) {
        for (Student student : this) {
            if (student.getCode().equals(code)) {
                return this.indexOf(student);
            }
        }
        return -1;
    }

    public void addStudent() {
        System.out.println("-------ADD STUDENT-------");

        String code = Inputter.inputPattern("Please input code", "^S\\d{3}$");

        if (searchID(code) != -1) {
            System.out.println("Code existed!");
            return;
        }
        String name = Inputter.inputNonBlankStr("Please input name");
        int mark = Inputter.inputInt("Input Student mark", 0, 10);
        this.add(new Student(code, name, mark));
        System.out.println("Add succesfully");
    }


    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("No student");
            return;
        }
        for (Student student : this) {
            System.out.println(student);
        }
    }

    public void removeStudent() {
        System.out.println("------REMOVE STUDENT------");
        if (this.isEmpty()) {
            System.out.println("No Student");
            return;
        }

        String code = Inputter.inputPattern("Please input code", "^S\\d{3}$");
        int index = searchID(code);
        if (index == -1) {
            System.out.println("Code not found");
            return;
        }
        this.remove(index);
        System.out.println("Remove succesfully");
    }
    
    public void updateStudent() {
        System.out.println("------UPDATE STUDENT------");
        if (this.isEmpty()) {
            System.out.println("No Student");
            return;
        }

        String code = Inputter.inputPattern("Please input code", "^S\\d{3}$");
        int index = searchID(code);
        if (index == -1) {
            System.out.println("Code not found");
            return;
        }
        String name = Inputter.inputNonBlankStr("Please input name");
        int mark = Inputter.inputInt("Input Student mark", 0, 10);
        this.get(index).setName(name);
        this.get(index).setMark(mark);
        System.out.println("Update succesfully");
    }

    public void searchStudent() {
        System.out.println("------SEARCH STUDENT------");
        if (this.isEmpty()) {
            System.out.println("No Student");
            return;
        }

        String code = Inputter.inputPattern("Please input code", "^S\\d{3}$");
        int index = searchID(code);
        if (index == -1) {
            System.out.println("Code not found");
            return;
        }
        System.out.println(this.get(index));
    }
}
