package JavaConcepts;

public class WrapperConcept 
{

	public static void main(String[] args) 
	{
		String x = "100";
		System.out.println(x+20);
		
		// Convert from String to int
		
		int i = Integer.parseInt(x);
	    System.out.println(i+20);

		String y = "12.33";
		System.out.println(y+100);
		
		// Convert from string to double
		
		double d = Double.parseDouble(y);
		System.out.println(d+100);
		
		String total ="1000";
		System.out.println(total+20);
		
		// Convert from String to int
		
		int actualamount = Integer.parseInt(total)+20;
		System.out.println("actual-amount");
		
		String h = "100T";
		System.out.println(h);
		
		// Convert from String to int
		
		int g = Integer.parseInt(h);
		System.out.println(g);
		
		int m = 100;
		System.out.println(m+20);
		
		// Convert from int to String
		 
		String n = String.valueOf(m);
		System.out.println(n+20);
		
		System.out.println(n+20);
		System.out.println(m+"20");
		System.out.println(m+20);
	   
	}

}
