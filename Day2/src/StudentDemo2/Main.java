package StudentDemo2;

public class Main {
   public static void main(String[] args) {
        Course MAD = new Course("MAD", 1);
        Course CS = new Course("CS", 2);

       Student khiem = new Student("Khiem", "VN");

       System.out.println(""+ khiem);
       System.out.println(""+ MAD);

       khiem.addCourseGrade(MAD);
       khiem.addCourseGrade(CS);

       System.out.println(khiem.getAddress());
       System.out.println(khiem.getAverageGrade());
       khiem.printGrade();
       System.out.println(khiem.getsName());
   } 
}
