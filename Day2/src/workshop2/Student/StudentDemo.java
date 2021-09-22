package workshop2.Student;

import java.util.Date;

public class StudentDemo {
    public static void main(String[] args) {
    
        Date dob= new Date(31/01/2002);
        Student st = new Student("Khiem", "DE160076", dob, "Nope", "AI", 0);
        st.printAllAttributes();
    
        }
}
