package prepend;
import java.util.*;
public class Teacher extends Person {
  private String EmployeeId;
  private String expertiseArea;
  private List<Course> taughtCourses;

public Teacher(String name, String surname, Date dateOfBirth, String contactInformation, String EmployeeId, String expertiseArea) {
	super(name, surname, dateOfBirth, contactInformation);
	this.EmployeeId = EmployeeId;
	this.expertiseArea = expertiseArea;

}


}

