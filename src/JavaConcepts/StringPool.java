package JavaConcepts;

public class StringPool
{

	public static void main(String[] args) 
	{
       String name = "Sunny";
       String name1 = "Sunny";
       String name3 = new String ("Sunny");
       String name4 = new String ("Sunny").intern();
       
       System.out.println(name == name1);
       System.out.println(name1 == name3);
       System.out.println(name1 == name4);
	}

}
