public class Example1
{
    public static void main(String[] args)
    {
	int denominator, numerator, ratio=0;


	numerator   = 5;
	denominator = 0;

    try{
    	ratio = numerator / denominator;
    	}
    catch(ArithmeticException e){
    	System.out.println("Arithmetic Exception was found");
    	e.printStackTrace();
    }
	System.out.println("The answer is: "+ ratio);

	System.out.println("Done."); // Don't move this line
    }
}
