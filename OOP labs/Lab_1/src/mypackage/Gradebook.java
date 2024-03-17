import mypackage.Student;

import java.util.ArrayList;
import java.util.List;

public class Gradebook {
    private String courseName;
    private String courseDescription;
    private int courseCredits;
    private String prerequisite;
    private List<Student> students;

    public Gradebook(String courseName, String courseDescription, int courseCredits, String prerequisite) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseCredits = courseCredits;
        this.prerequisite = prerequisite;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + courseName + "!");
        System.out.println("Please, input grades for students:");
    }

    public void displayGradeReport() {
        determineClassAverage();
        displayLowestGrade();
        displayHighestGrade();
        outputGradesDistribution();
    }

    private void determineClassAverage() {
        double total = 0.0;
        int count = 0;

        for (Student student : students) {
            total += student.getGrade();
            count++;
        }

        double classAverage = count > 0 ? total / count : 0;
        System.out.printf("Class average is %.2f.\n", classAverage);
    }

    private void displayLowestGrade() {
        int lowestGrade = Integer.MAX_VALUE;
        Student lowestGradeStudent = null;

        for (Student student : students) {
            if (student.getGrade() < lowestGrade) {
                lowestGrade = student.getGrade();
                lowestGradeStudent = student;
            }
        }

        System.out.println("Lowest grade is " + lowestGrade + " (" + lowestGradeStudent + ").");
    }

    private void displayHighestGrade() {
        int highestGrade = Integer.MIN_VALUE;
        Student highestGradeStudent = null;

        for (Student student : students) {
            if (student.getGrade() > highestGrade) {
                highestGrade = student.getGrade();
                highestGradeStudent = student;
            }
        }

        System.out.println("Highest grade is " + highestGrade + " (" + highestGradeStudent + ").");
    }

    private void outputGradesDistribution() {
        int[] gradeCounts = new int[11];

        for (Student student : students) {
            int grade = student.getGrade();
            if (grade >= 0 && grade <= 100) {
                gradeCounts[grade / 10]++;
            }
        }

        for (int i = 0; i < gradeCounts.length; i++) {
            int lowerBound = i * 10;
            int upperBound = (i + 1) * 10 - 1;

            if (i == 10) {
                upperBound = 100;
            }

            System.out.printf("%02d-%02d: %s\n", lowerBound, upperBound, "*".repeat(gradeCounts[i]));
        }
    }
}
