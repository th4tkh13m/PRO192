package Assignment.WS9.Data;

import java.util.ArrayList;

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

                String code = Inputter.inputPattern("Please input code", "");
                String name = Inputter.inputNonBlank("Please input name");

        }
}
