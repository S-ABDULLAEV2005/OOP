package my_pack;
import java.util.*;
public class Patterns {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	  
	  
	  for(int i = 0; i <= n; i++) {
		  for(int j = 0; j < i; j++) {
			  System.out.print("*");
		  }
	  System.out.println();
	  }
   for(int i = 4; i > 0; i--) {
	   for(int j = 0; j < i; j++) {
			  System.out.print("*");
		  }
    System.out.println();  
   }
 
   
  }
}
