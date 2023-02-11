package InterfaceConcept;

public class Wheller implements InterfaceImplementationConcept
{

	public static void main(String[] args)
	{
		Wheller wh = new Wheller();
			   
	     wh.Fourwheller();
		 wh.Twowheller();
			   
	 }
     public static void Twowheller()
     {
	     System.out.println("I am in Wheller class - Twowheller");
     }
     public static void Fourwheller()
     {
	     System.out.println("I am in Wheller class - Fourwheller");
	 }
}




