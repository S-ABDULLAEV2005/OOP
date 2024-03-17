package mypackage;

import mypackage.Student;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.println("Enter course description: ");
        String courseDescription = scanner.nextLine();
        System.out.println("Enter course credits: ");
        int courseCredits = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter prerequisite: ");
        String prerequisite = scanner.nextLine();

        GradeBook gradeBook = new GradeBook(courseName, courseDescription, courseCredits, prerequisite);

        System.out.println("Enter student grades (type 'done' to finish):");

        int studentId = 1;
        while (true) {
            System.out.print("Student " + studentId + ": ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            int grade = Integer.parseInt(input);
            Student student = new Student(studentId, "Student " + studentId);
            student.setGrade(grade);
            gradeBook.addStudent(student);
            studentId++;
        }

        gradeBook.displayMessage();
        gradeBook.displayGradeReport();
    }
}
