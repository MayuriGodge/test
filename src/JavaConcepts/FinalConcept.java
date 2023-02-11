package JavaConcepts;

public class FinalConcept
{
	int i=100;

	public static void main(String[] args)
	{
		function1();
	}
	public static void function1()
	{
		int i=10445;
		System.out.println("I am in function1");
		System.out.println("Values of i is " + "  " + i);
	}
	public void function1 (int i)
	{
		this.i=i;
		System.out.println("I am in function1");
		System.out.println("Values of i is " + "  " + i);
	}
}
