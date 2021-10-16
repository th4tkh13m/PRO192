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
			int index = Validator.checkCourseID(courseList, course.getId());
			if (index == -1) {
				courseList.add(course);
				System.out.println("Course add successfully");
			} else {
				System.out.println("The course ID is existed! Try again.");
			}
			System.out.println("Do you want to continue?");
			if (!Validator.inputYN()) {
				break;
			}
		}
	}

	public Course getCourseById(String id) {
		int index = Validator.checkCourseID(courseList, id);
		if (index != -1) {
			return courseList.get(index);
		}
		return null;
	}

	public void listAll() {
		if (courseList.isEmpty()) {
			System.out.println("There is no course");
		} else {
			System.out.println("All available courses");
			for (Course course : courseList) {
				System.out.println(course);
			}
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
		if (courseList.isEmpty()) {
			System.out.println("There is no course.");
		} else {
			Collections.sort(courseList);
			listAll();
		}
	}

	public void update() {
		if (courseList.isEmpty()) {
			System.out.println("There is no such courses.");
		} else {
			while (true) {
				System.out.println("Enter the Enter course ID");
				String id = Validator.inputString();
				int index = Validator.checkCourseID(courseList, id);
				if (index != -1) {
					courseList.set(index, new Course().createCourse());
				} else {
					System.out.println("There is no such ID. Wanna create one?");
					if (Validator.inputYN()) {
						add();
					}
				}
				System.out.println("Continue?");
				if (!Validator.inputYN()) {
					break;
				}
			}
		}
	}
}
