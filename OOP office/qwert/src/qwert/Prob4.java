package qwert;
import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		
		double D = b * b - (4 * a * c);
		if(D > 0) {
			double x1 = (-1 * b - Math.sqrt(D)) / 2 * a;
			double x2 = (-1 * b + Math.sqrt(D)) / 2 * a;
			System.out.println(x1);
			System.out.println(x2);		
			
		} else if(D == 0) {
			double x = (-1 * b) / 2 * a;
			System.out.println(x);
		} else {
			System.out.println("D is Negative!");
		}
		scan.close();
    

	}

}
