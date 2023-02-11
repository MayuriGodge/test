package JavaConcepts;

public class FinallyConcept 
{

	public static void main(String[] args)
	{
		 try
		 {
			 int a = 9/0;
	         System.out.println("Value of a is " + " " + a);
			   
		 }
		 catch (Exception e)
	     {
		     System.out.println("I am in Catch Block");
		 }
		 finally
		 {
			 System.out.println("I am using Finally Keyword");
			 Add();
			 
		 } 
	}
    public static void Add()
    {
    	int a = 10;
    	int b = 20;
    	int c = a + b;
    	System.out.println("Total Addition " + c);
    }
}
