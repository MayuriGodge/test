package JavaConcepts;

public class ConditionsConcepts
{

	public static void main(String[] args) 
	{
		System.out.println("=================>if, if else, if else if<====================");
		/*  Syntax of if statement
		 * 
		 * 
			  if(Condition)
			  {
			  
			  // Print value
			   
			  }
			    		   	
		 *
		 */
			 int x = 10;
			 int y = 20;
			 
			 if (x>y)
			 {
				 System.out.println("Greatest value is " + x);
				 
			 }
               
			     System.out.println("Greatest value is " + y);
			       
			     
			   /*  Syntax of if statement
					 * 
					 * 
						  if(Condition)
						  {
						  
						  // Print value
						   
						  }
						   else
						   {
						      // Statement
						       
						   }	    		   	
			   */
			     
			     int a = 40;
			     int b = 30;
			     
			     if (a>b)
			     {
			    	 
			    	 System.out.println("Greatest value is " + a);
			    	 
			     }
			     else
			     {
			    	 
			    	 System.out.println("Greatest value is " + b);
			    	 
			     }
			       System.out.println("I am out of the loop");
			  /*  Syntax of if statement
					 
					  
				if(Condition)
				 {
						  
				       // Print value
						   
			     }
				   else if
				 {
					   // Print Value
						       
				 }	    	
				  	  // Statement 	
				  	   
			   */  
			       
			    int m = 24;
			    
			    if (m<12)
			    {
			    	
			    	System.out.println("Value of m is True " + m);
			    	
			    }
			    else if (m>55)
			    {
			    	System.out.println("Value is less than m " + m);
			    	
			    }
			     
			        System.out.println("Value of m is greater " + m);
			        
			        
			 	     
	     System.out.println("=================>Switch Statement<====================");
	     
	     // Syntax of Switch Statement
	     /*
	        Switch (Expression)
	        {
	          case a :
	                  //code
	          break;
	          case b :
	                  //code
	          break;
	          case c :
	                  //code
	          break;
	          case d :
	                  //code
	          break;
	      */
	     
	     
	     int Day = 12;
	     
	     switch (Day)
	     {
	     case 1 : System.out.println("First Day of the week"); 
	     break;
	     case 2 : System.out.println("Second Day of the week"); 
	     break;
	     case 3 : System.out.println("Third Day of the week"); 
	     break;
	     case 4 : System.out.println("Fourth Day of the week"); 
	     break;
	     case 5 : System.out.println("Fifth Day of the week"); 
	     break;
	     case 6 : System.out.println("Sisth Day of the week"); 
	     break;
	     case 7 : System.out.println("Seventh Day of the week"); 
	     break;
	     }
	     System.out.println("Please give corect input");
	}
}

