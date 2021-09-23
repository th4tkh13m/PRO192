package StudentDemo2;

public class Main {
   public static void main(String[] args) {
      Course MAD = new Course("MAD", 1);

      Student khiem = new Student("Khiem", "11");
      khiem.setNumCourse(5);
      System.out.println(khiem);
      System.out.println(MAD);

      khiem.addCourseGrade();
      System.out.println(khiem.getAverageGrade());
      khiem.printGrade();
   }
}
