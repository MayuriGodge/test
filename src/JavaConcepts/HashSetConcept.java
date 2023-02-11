package JavaConcepts;

import java.util.HashSet;

public class HashSetConcept
{

	public static void main(String[] args) 
	{
	  HashSet<String> h1 = new  HashSet<String>();
	  
	  h1.add("MARUTI");
	  h1.add("BMW");
	  h1.add("FORD");
	  
	  System.out.println("Size of HashSet is " + h1.size());
	  System.out.println(h1);
	  
	  boolean b1 = h1.contains("TOYOTA");
	  System.out.println(b1);
	  
	  h1.remove("FORD");
	  System.out.println(h1);
	  
	  System.out.println("Size of HashSet is " + h1.size());
	  
	  System.out.println("=========ForEachLoop===========");
	  
	  for (String s1 : h1)
	  {
		  System.out.println("HashSet via loop " + s1);
	  }
	}

}
