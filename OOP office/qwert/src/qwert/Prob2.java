package qwert;
import java.util.Scanner;
public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		System.out.println("Enter your number!");
		
		double area = b * b;
		double per = 4 *b;
		double diag = Math.sqrt(2) * b;
		
		System.out.println(area);
		System.out.println(per);
		System.out.println(diag);
		scan.close();
	    
	}

}
