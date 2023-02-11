package JavaConcepts;

public class MethodOverloadingConcept
{

	public static void main(String[] args)
	{
		MethodOverloadingConcept m1 = new MethodOverloadingConcept();
		  m1.MethodOverloadingConcept();
		  m1.MethodOverloadingConcept(10);
	}
	public static void MethodOverloadingConcept()
	{
		System.out.println("I am in 0 parameteried function");
	}
	public static void MethodOverloadingConcept(int a)
	{
		System.out.println("I am in 1 parameteried function");
	}
	
}
