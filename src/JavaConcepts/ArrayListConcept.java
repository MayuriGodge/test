package JavaConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept 
{

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mayuri");
		al.add("Priyanka");
		al.add("Nutan");
		al.add("Mrunali");
		al.add("Onkar");
		
		System.out.println("Arraylist contains the values " + al);
		
		System.out.println("Arraylist values at 1st location " + al.get(1));
		
		al.remove(3);
	
		System.out.println("Arraylist contains the values " + al.get(3));
		
		System.out.println("Arraylist size ====> " + al.size());
		
		// al.size();
		
		System.out.println("Arraylist contain the values =====> " + al);
		
		
		System.out.println("==========ForEachLoop==========");
		  
		
		for(String a:al)
		{
			System.out.println(a);
		}
		
		
		System.out.println("==========Sort Arraylist==========");
		
		
		Collections.sort(al);
		
		System.out.println("Arraylist contains the after values " + al);
		
		int in = al.indexOf("Nutan");
		System.out.println(in);
		
        boolean b = al.contains("Nutan");
        System.out.println(b);
		
        boolean b1 = al.contains("Arbaj");
        System.out.println(b1);
	
	}
	
}
