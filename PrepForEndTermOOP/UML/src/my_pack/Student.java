package my_pack;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int studentId;
    private String major;
    private List<Course> enrolledCourses;

    public Student(String name, String dateOfBirth, String contactInfo, int studentId, String major) {
        super(name, dateOfBirth, contactInfo);
        this.studentId = studentId;
        this.major = major;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }
}


