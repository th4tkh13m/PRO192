package workshop6.Question2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * CourseList
 */
public class CourseList {

	private ArrayList<Course> courseList = new ArrayList<Course>();
	private Scanner in = new Scanner(System.in);

	public CourseList() {
	}

	public void add() {
		while (true) {
			Course course = new Course().createCourse();
			ArrayList<Integer> idList = Validator.checkCourseID(courseList, course.getId());
			if (idList.isEmpty()) {
				courseList.add(course);
				System.out.println("Course add successfully");
			} else {
				System.out.println("The course ID is existed! Try again.");
			}
			System.out.println("Do you want to continue?");
			if (Validator.inputYN()) {
				break;
			}
		}
	}
}
