package JavaConcepts;

public class ExceptionConcept
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
	}

}
