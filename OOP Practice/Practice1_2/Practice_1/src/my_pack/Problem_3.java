package my_pack;
import java.util.Scanner;
public class Problem_3 {

	public static void main(String[] args) {
		

	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the numeric grade: ");
		        double grade = scanner.nextDouble();

		        if (grade >= 90) {
		            System.out.println("Grade: A");
		        } else if (grade >= 85) {
		            System.out.println("Grade: A-");
		        } else if (grade >= 80) {
		            System.out.println("Grade: B+");
		        } // Add more conditions for other grades as needed

		        scanner.close();
		    }
		}

	