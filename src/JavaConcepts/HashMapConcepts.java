package JavaConcepts;

import java.util.HashMap;

public class HashMapConcepts 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> h1 = new HashMap<String, String>();
		
		h1.put("City","Pune");
		h1.put("City1","Mumbai");
		h1.put("City2","Aurangabad");
		h1.put("City3","Nashik");
		
		System.out.println(h1);
		
		h1.remove("City2");
		System.out.println(h1);
		
		h1.size();
		System.out.println("Size of HashMap is ====> " + h1.size());
		
		System.out.println("=========ForEachLoop============");
		
		for (String s : h1.keySet())
		{
			System.out.println(s);
		}
		for (String s1 : h1.values())
		{
			System.out.println(s1);
		}
		for (String s : h1.keySet())
		{
			System.out.println("Key is " + " " + s + " " + " & " + " " + "Value is " + " " + h1.get(s));
		}
		
		
			
		
		
	
		
	}

}
