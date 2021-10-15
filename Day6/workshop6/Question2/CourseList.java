package workshop6.Question2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * CourseList
 */
public class CourseList {

	private ArrayList<Course> courseList = new ArrayList<Course>();

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

	public Course getCourseById(String id) {
		ArrayList<Integer> idList = Validator.checkCourseID(courseList, id);
		for (Integer index : idList) {
			return courseList.get(index);
		}
		return null;
	}

	public void listAll() {
		System.out.println("All available courses");
		for (Course course : courseList) {
			System.out.println(course);
		}
	}

	public void printCourse(Course course) {
		System.out.println(course);
	}

	public void search() {
		if (courseList.isEmpty()) {
			System.out.println("There is no course!");
		} else {
			ArrayList<Course> findId = new ArrayList<>();
			while (true) {
				System.out.println("Enter the Course ID:");
				String id = Validator.inputString();
				findId.add(getCourseById(id));
				System.out.println("Do you want to find more courses?");
				if (!Validator.inputYN()) {
					break;
				}
			}
			if (findId.isEmpty()) {
				System.out.println("404 Not Found");
			} else {
				for (Course course : courseList) {
					printCourse(course);
				}
			}
		}

	}

	public void sort() {
		Collections.sort(courseList);
		listAll();
	}

	public void update() {

	}
}
