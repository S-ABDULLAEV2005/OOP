package prepend;

	import java.util.*;

	// Student class
	public class Odam extends Test {
	    private int studentId;
	    private String major;
	    private List<Course> enrolledCourses;

	    // Constructor
	    public Odam(String name, Date dateOfBirth, String contactInformation, int studentId, String major) {
	        super(name, dateOfBirth, contactInformation);
	        this.studentId = studentId;
	        this.major = major;
	    }

	    // Getter methods (for brevity)
	    public int getStudentId() {
	        return studentId;
	    }

	    public String getMajor() {
	        return major;
	    }

	    public List<Course> getEnrolledCourses() {
	        return enrolledCourses;
	    }

	    // Overriding the displayInfo method from the Person class
	    @Override
	    public void displayInfo() {
	        super.displayInfo(); // Call the displayInfo method of the superclass
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Major: " + major);
	    }

	    // Overloading the displayInfo method
	    public void displayInfo(boolean showCourses) {
	        displayInfo(); // Call the overridden displayInfo method
	        if (showCourses) {
	            System.out.println("Enrolled Courses: " + enrolledCourses);
	        }
	    }
	}


