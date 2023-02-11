package MethodOverridingConcept;

public class Test
{
	public static void main(String[] args) 
	{
       ICICI ic = new ICICI();
       {
    	   System.out.println(ic.RatioOfIntrest());
       }
       Kotak k = new Kotak();
       {
    	   System.out.println(k.RatioOfIntrest());
       }
	}

}
