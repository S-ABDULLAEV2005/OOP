package my_pack;

public class UniversityManagementSystem {
	public static void main(String[] args) {
        // Creating instances for testing
        Student student1 = new Student("John Doe", "1990-01-01", "john@example.com", 12345, "Computer Science");
        Professor professor1 = new Professor("Dr. Smith", "1965-05-15", "smith@example.com", "P001", "Computer Science");
        Course course1 = new Course("CS101", "Introduction to Programming", "Fundamentals of programming");

        // Enrolling student in the course
        course1.enrollStudent(student1);

        // Adding professor to the department
        Department computerScienceDepartment = new Department("D001", "Computer Science");
        computerScienceDepartment.addProfessor(professor1);

        // Displaying information
        System.out.println("Student Information:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Date of Birth: " + student1.getDateOfBirth());
        System.out.println("Contact Information: " + student1.getContactInfo());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Major: " + student1.getMajor());
        System.out.println("Enrolled Courses: " + student1.getEnrolledCourses());

        System.out.println("\nProfessor Information:");
        System.out.println("Name: " + professor1.getName());
        System.out.println("Date of Birth: " + professor1.getDateOfBirth());
        System.out.println("Contact Information: " + professor1.getContactInfo());
        System.out.println("Employee ID: " + professor1.getEmployeeId());
        System.out.println("Expertise Area: " + professor1.getExpertiseArea());

        System.out.println("\nCourse Information:");
        System.out.println("Course ID: " + course1.getCourseId());
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Description: " + course1.getDescription());
        System.out.println("Enrolled Students: " + course1.getEnrolledStudents());

        System.out.println("\nDepartment Information:");
        System.out.println("Department ID: " + computerScienceDepartment.getDepartmentId());
        System.out.println("Department Name: " + computerScienceDepartment.getDepartmentName());
        System.out.println("Professors: " + computerScienceDepartment.getProfessors());
    }
}


