package JavaConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept
{

	public static void main(String[] args)
	{
		// Iterator will used in Collection Framework
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Aditi");
		al.add("Dipali");
		al.add("Mayuri");
		al.add("Vaishnavi");
		al.add("Manali");
		
		System.out.println(al);
		
		Iterator <String> it = al.iterator();
		
		System.out.println(it);
		
		System.out.println(it.next());
		
		while(it.hasNext())
		{
			System.out.println("Next values are : " + it.next());
		}
	}

}
