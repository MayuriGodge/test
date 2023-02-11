package JavaConcepts;

public class Operators
{
	public static void main(String[] args)
	{
		
		// Single Line Comment 
		
	         // Arithmetic Operators =====>  +, -, /, *, ++x, --x, %
		     // Assignment Operators =====>  =, +=, -=, *=, /=, &=, !=, ^=, <<=, >>=		
		     // Logical Operators ====> &&-and, ||-or, !-not
			
		/*
		  My name 
		  My Age
		  My Skills 
		  My Qualification 
	   */
		
		// Arithmetic Operators -
		
		// Addition Operator 
		    
		    int a =20;        
		    int b =40;
		    		
		   
		    int c = a+b;
		    System.out.println("Value of c is ===> " + c);
		    
		   
		// Subtraction Operator
		    
		    int d = a-b;
		    System.out.println("Value of d is ===> " + d);
		                     
		    
		// Multiple Operator
		      
		    int e = a*b;
		    System.out.println("Value of e is ===> " + e);
		    
		    
		// Division Operator
		   
		    int f = a/b;
		    System.out.println("Value of f is ===> " + f);
		    
		    
		// Percent Operator
		    
		    int g = a%b;
		    System.out.println("Value of g is ===> " + g);
		    
		    
	   //  Increment Operator
		    
			int h = ++a;
		    System.out.println("Value of x is ===> " + h);
		    
		    System.out.println("Value of y is ===> " + h+a);
		    System.out.println("Value of z is ===> " + (h+a));
		    
		  
	  //   Decrement Operator
		    
		    int p = a++; // x=10;
		    System.out.println("Value of p is ===> " + p);
		    
		    System.out.println("Value of q is ===> " + p+b); 	  
		    System.out.println("Value of r is ===> " + (p+b));
		    
	  
		  
     //    Logical Operators -
		     
		    int i = 20;
		    System.out.println("Result of and operator is ====> " + " " + (i>40&&i<100));
		    
		    System.out.println("Result of and operator with not equals is ====> " + " " + !(i>40&&i<100));
		    
		    System.out.println("Result of or operator is ====> " + " " + (i>40||i<100));
		    
		    System.out.println("Result of or operator with not equals is ====> " + " " + !(i>40||i<100));
		   	    
		    
	    
	}

}
