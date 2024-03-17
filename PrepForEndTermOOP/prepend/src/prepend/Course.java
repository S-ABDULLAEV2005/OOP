package prepend;
import java.util.*;
public class Course {
private String courseId;
private String courseName;
private String description;
private List<Student> enrolledStudents;

private Course(String courseId, String courseName, String description) {
	this.courseId = courseId;
	this.courseName = courseName;
	this.description = description;
}
}
