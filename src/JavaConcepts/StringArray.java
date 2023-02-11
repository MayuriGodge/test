package JavaConcepts;

public class StringArray 
{

	public static void main(String[] args) 
	{
		String[] m1 = new String[20];
		m1[0] = "Mayuri";
		m1[2] = "Priyanka";
		m1[3] = "Onkar";
		m1[4] = "Aditi";
		m1[5] = "2410";
		
		System.out.println(m1[0]);
		System.out.println(m1[1]);
		System.out.println(m1[2]);
		System.out.println(m1[3]);
		System.out.println(m1[4]);
		
		System.out.println("=================ForEachLoop================");
	
	    for (String m : m1)
	    {
		     System.out.println(m);
	    }
	
	  Object[] o1 = new Object[30];
	  
	  o1[0] = "Bhaskar";
	  o1[1] = "Mayuri";
	  o1[2] = "400";
	  o1[3] = "100.45f";
	  o1[4] = "10000.223";
	
	  for (int i=29;i>=0;i--)
	  {
		   System.out.println("Values of o1 array is " + i + "th location " + o1[i]);
		   
	  }
  }
}
