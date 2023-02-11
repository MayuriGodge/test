package JavaConcepts;
public class LoopConcepts 
{

	public static void main(String[] args)
	{
		System.out.println("===============For Loop================");
		// For Loop
		/* 
		  Syntax - 
		      for(statement 1-Initialization; statement 2-Condition; statement 3-Increment/Decrement)
		      {
		      
		      }
		  
		 */
         
		// Example
		
		for (int i=0; i<=10; i++)
		{
			System.out.println("Value of i is " + i);
		}
		
		System.out.println("===============While Loop================");
		
		// While Loop
		/*
		  Syntax -
		      while (test expression)
		      {
		        //Code
		      }
		      
		 */
		 
		 // Example
		
		int j=10;
		while (j<1)
	    { 
	       System.out.println("Value of j is " + j);
	    }
		
		System.out.println("===============Do While Loop================");
		
		// do while loop
		/*
          Syntax -
              do
              {
                // body of do while loop
              }
              while (test expression)
              		 
		 */
         // Example 
		  
		 int k=10;
		 do
		 {
			 System.out.println(k);
			 k--;
		 }
		 while (k>0);
		 
		 System.out.println("===============For Each Loop================");
		
		 // For Each loop
		 /*
	       Syntax -
	           for (DataType Variable : Array | Collection)	  
		       {
		          // Body of for each loop
		       }
		       
		  */
		 // Exaample
		 
		 char[]vowels = {'a','e','i','o','u'};
		 for (char item: vowels)
		 {
			 System.out.println(item);
		 }
			 
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
