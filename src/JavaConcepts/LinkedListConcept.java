package JavaConcepts;

import java.util.LinkedList;

public class LinkedListConcept
{

	public static void main(String[] args)
	{
		LinkedList<String> Vehicle = new LinkedList<String>();
		
		Vehicle.add("Maruti");
		Vehicle.add("BMW");
		Vehicle.add("Mercidies");
		Vehicle.add("Mahindra");
		
		System.out.println("List will contain the values " + " " + Vehicle);
		 
		Vehicle.addFirst("Honda");
		
		System.out.println("List will contain the value " + " " + Vehicle);
		
		int indexing = Vehicle.indexOf(Vehicle);
		
		System.out.println(indexing);
		Vehicle.add(5,"Jeep");
		System.out.println("List will contain the values " + " " + Vehicle);
		
		Vehicle.add(5,"Hyundai");
		System.out.println("List will contain the values " + " " + Vehicle);
		
		//get the item based on indexing
		
		String Dataposition = Vehicle.get(6);
	    System.out.println("Data at sixth position is ====> " + Dataposition);
		
		//Removing data from the list
	    
	    Vehicle.remove(3);
	    System.out.println("List will contain the value " + " " + Vehicle);
	    
	    boolean b1 = Vehicle.contains("Maruti");
	    System.out.println(b1);
	    boolean b2 = Vehicle.contains("Audi");
	    System.out.println(b2); 
	    
	    System.out.println("First element " + " " + Vehicle.getFirst());
	   
	    System.out.println("Last element " + " " + Vehicle.getLast());
	    
	    System.out.println("Size of Vehicle is ===> " + " " + Vehicle.size());
	}
}
