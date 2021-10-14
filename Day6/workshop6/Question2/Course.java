package workshop6.Question2;

public class Course implements Comparable<Course>{
    private String id;
    private String courseName;
    private int credit;
    public Course() {
    }
    public Course(String id, String courseName, int credit) {
        this.id = id;
        this.courseName = courseName;
        this.credit = credit;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
	public Course createCourse() {
		System.out.println("Enter course ID:");
		// id = sys
		return null;
	}
    @Override
    public int compareTo(Course o) {
        return o.courseName.compareTo(this.courseName);
    }
	@Override
	public String toString() {
		return "Course{courseName=" + courseName + ", credit=" + credit + ", id=" + id + "}";
	}
    
}
