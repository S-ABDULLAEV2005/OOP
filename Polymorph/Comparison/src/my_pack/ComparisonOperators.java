package my_pack;
import java.util.Scanner;
public class ComparisonOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		boolean c = (a == b);
      if(c) {
    	  System.out.println(c);
  
      }else {
		System.out.println("It is false, try another number!");

	}
	}
}
