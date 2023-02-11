package JavaConcepts;

public class DeadCode
{

	private static final boolean True = false;

	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		
	   if (a>b)
	   {
		   System.out.println("I am in if block");
	   }
	   else
	   {
		   System.out.println("I am in else block");
	   }
       System.out.println("==========Dead Code==========");
       
	   if(True)
	   {
		   System.out.println("I am in if block");
	   }
	   else
	   {
		   System.out.println("I am in dead code");
	   }
	}

}
