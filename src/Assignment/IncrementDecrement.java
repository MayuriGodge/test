package Assignment;

public class IncrementDecrement
{

	public static void main(String[] args)
	{
		int i = 1;
		int j = i++;  // post increment
		System.out.println("Value of i is " + i);
		System.out.println("Value of j is " + j);
		
		int p = 2;
		int q = ++p;  // pre increment
		System.out.println("Value of p is " + p);
		System.out.println("Value of q is " + q);
		
		int m = 2;
		int n = m--;  // post decrement 
		System.out.println("Value of m is " + m);
		System.out.println("Value of n is " + n);
		
		int g = -2;
		int h = --g;  // pre decrement  
		System.out.println("Value of g is " + g);
		System.out.println("Value of h is " + h);
		
		int c = -2;
		int d = --c;  // pre decrement [c=c-1]
		System.out.println("Value of c is " + c);
		System.out.println("Value of d is " + d);

	}

}
