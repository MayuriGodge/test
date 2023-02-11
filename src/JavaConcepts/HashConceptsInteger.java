package JavaConcepts;

import java.util.HashSet;

public class HashConceptsInteger
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		h1.add(10);
		h1.add(30);
		h1.add(40);
		
		System.out.println(h1.iterator());
		
		int size = h1.size();
		System.out.println(size);

		System.out.println("=========ForLoop========");
		
		for (int i=2; i<h1.size(); i++)
		{
			System.out.println(h1.size()); 
		}
		
		System.out.println("=======ForEachLoop======");
			
		for (int i : h1)
		{
			System.out.println(h1.size());
		}
	}

}
