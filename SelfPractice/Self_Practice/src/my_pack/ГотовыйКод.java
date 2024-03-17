package my_pack;
import java.util.*;

// String Tokenizer


public class ГотовыйКод {
    public static void main(String[] args)
    {
       double leftOperand;
       double result;
       double rightOperand;
       String  leftString;
       String operator; 
       String rightString;
       StringTokenizer tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+-/*", true);

       try
       {
          leftString   = tokenizer.nextToken();
          operator     = tokenizer.nextToken();
          rightString  = tokenizer.nextToken();

          leftOperand  = Double.parseDouble(leftString);
          rightOperand = Double.parseDouble(rightString);

          if (operator.equals("+")) {
        	  result = leftOperand + rightOperand;
          }
          else if(operator.equals("-")) {
        	  result = leftOperand - rightOperand;
          }
          else if(operator.equals("*")) {
        	  result = leftOperand * rightOperand;
          }
          else if(operator.equals("/")) {
        	  if(rightOperand != 0) {
            	  result = leftOperand / rightOperand;
        	  }else {System.out.println("Division by zero is non accessable!");
        	  return;}
          }
          else {
        	  result = 0.0;
          }

          System.out.println("Result: " + result);
       }
       catch (NoSuchElementException n)
       {
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException x)
       {
          System.out.println("One or more operands is not a number");
       }


    }

}
