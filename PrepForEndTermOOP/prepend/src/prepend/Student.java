package prepend;
import java.util.*;
public class Student extends Person {
   private int studentId;
   private String major;
   private List<Course> enrolledCourses;
   
   public Student(String name, String surname, Date dateOfBirth, String contactInformation, int studentId, String major) {
	   super(name, surname, dateOfBirth, contactInformation );
	   this.studentId = studentId;
	   this.major = major;
   }
}
