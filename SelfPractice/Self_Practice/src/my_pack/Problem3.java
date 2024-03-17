package my_pack;
import java.util.*;
public class Problem3 {

	   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
	 
//       try {
       
       int point = scan.nextInt();
	   
	 
	   
	   if(point >= 95) {
		   System.out.println("Your grade is A");
	   } else if(point >= 90){
		   System.out.println("Your grade is A-");
	   } else if(point >= 85) {
		   System.out.println("Your grade is B+");
	   } else if(point >= 80) {
		   System.out.println("Your grade is B");
	   } else if(point >= 75) {
		   System.out.println("Your grade is B-");
	   } else if(point >= 70) {
		   System.out.println("Your grade is C+");
	   } else if(point >= 65) {
		   System.out.println("Your grade is C");
	   } else if(point >= 60) {
		   System.out.println("Your grade is C-");
	   } else if(point >= 50) {
		   System.out.println("Your grade is D");
	   } else if(point >= 0) {
		   System.out.println("Your grade is F");
	   } 
//	  } catch(NumberFormatException x) {
//		  System.out.println("Invalid syntax");
//	  }
      
	   
}
	   }

