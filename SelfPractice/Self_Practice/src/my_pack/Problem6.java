package my_pack;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){

    	
    	        Scanner scanner = new Scanner(System.in);
    	        String s = scanner.nextLine();

    	        char[] temp = new char[s.length()];
    	        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
    	            temp[j] = s.charAt(i);
    	        }

    	        String reversed = new String(temp);
                if(reversed.equals(s)) {
                	System.out.println(s + " is palindrome!");
                } else {
                	System.out.println(s + " is not a palindrome!");
                }

    }
    }
    	    	
//    	        Scanner scanner = new Scanner(System.in);
//    	        String s = scanner.next();
//    	        String temp = s;
//    	        StringBuilder reversed = new StringBuilder(s).reverse();
//    	        if (temp.equals(reversed.toString())) {
//    	            System.out.println("true");
//    	        } else {
//    	            System.out.println("false");
//    	        }
//    }
//}
//    	
    	
    	
    	
    	
    	
    	



