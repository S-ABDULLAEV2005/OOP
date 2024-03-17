package runtimepoly;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", new Date(), "john@example.com", 12345, "Computer Science");

        // Create a Person reference and assign it a Student object
        Person person = student;

        // Call the displayInfo method (runtime polymorphism)
        person.displayInfo();
    }
}
