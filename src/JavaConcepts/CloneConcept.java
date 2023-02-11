package JavaConcepts;

public class CloneConcept
{
	public static void main(String[] args) 
	{
		int a[] = new int[10];
		int clone[] = new int[10];
		a.clone();
		clone = a;
		System.out.println("=========Clone Array========");
		System.out.println(clone[0]);
		
		for(int i=0; i<clone.length;i++)
		{
			System.out.println("Clone array at " +i + "th location ------>" + clone[i]);
		}
	}
	

}
