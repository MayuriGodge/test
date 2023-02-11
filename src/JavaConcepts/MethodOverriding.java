package JavaConcepts;

public class MethodOverriding
{

	public static void main(String[] args)
	{
		MethodOverriding m1 = new MethodOverriding();
		m1();
		m1.m2();
	}
    public static void m1()
    {
    	System.out.println("I am in m1 function");	
    }
    public void m2()
    {
    	System.out.println("I am in m2 function");
    }
}
