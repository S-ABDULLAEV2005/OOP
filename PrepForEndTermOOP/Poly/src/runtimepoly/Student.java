package runtimepoly;
import java.util.*;

//Student class
public class Student extends Person {
 private int studentId;
 private String major;
 private List<Course> enrolledCourses;

 // Constructor
 public Student(String name, Date dateOfBirth, String contactInformation, int studentId, String major) {
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
     System.out.println("Student Information:");
     super.displayInfo(); // Call the displayInfo method of the superclass
     System.out.println("Student ID: " + studentId);
     System.out.println("Major: " + major);
 }
}
