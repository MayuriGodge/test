package Assignment;

public class ConcatinationConcept
{

	public static void main(String[] args)
	{
		int a = 300;
		int b = 400;
		String c = "300";
		String d = "400";
		
		System.out.println(a+c+b+d);
		System.out.println(a+b+c+d);
		System.out.println(a+b(c+d));
		System.out.println(a+c(c+d));
		System.out.println(c+d+a+b);
		System.out.println(c+d(a+b));		
		
	}

	private static int b(String string) 
	{
			return 0;
	}

	private static int c(String string)
	{
	    	return 0;
	}

	private static String d(int i)
	{
			return null;
	}
	
}
