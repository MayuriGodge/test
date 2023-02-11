package JavaConcepts;

public class ConstructorConcept
{

	public static void main(String[] args)
	{
		  ConstructorConcept cc = new ConstructorConcept();
	      ConstructorConcept cc1 = new ConstructorConcept (1234);
	      ConstructorConcept cc2 = new ConstructorConcept (12345, "Mayuri");
	      ConstructorConcept cc3 = new ConstructorConcept (12345, "Mayuri", "Khopoli");
	      ConstructorConcept cc4 = new ConstructorConcept (12345, "Mayuri", "Khopoli", true);
	   
	}
	public ConstructorConcept()
	{
	       System.out.println("I am in zero or default Parameterization Constructor");
	}
	public ConstructorConcept(int EmpID)
	{
			System.out.println("I am in one type Parameterization Constructor =====>" + " " + EmpID);
	}
	public ConstructorConcept(int EmpID, String Ename)
	{
			System.out.println("I am in two type Parameterization Constructor =====>" + " Employee ID is " + EmpID + " Employee Name is " + Ename);
	}
	public ConstructorConcept(int EmpID, String Ename, String Address)
	{
			System.out.println("I am in three type Parameterization Constructor =====>" + " Employee ID is " + EmpID + " Employee Name is " + Ename + " " + " Employee Address is " + " " + Address);
	}
	public ConstructorConcept(int EmpID, String Ename, String Address, boolean ispermanent)
	{
			System.out.println("I am in four type Parameterization Constructor =====>" + " Employee ID is " + EmpID + " Employee Name is " + Ename + " " + " Employee Address is " + " " + Address + " Employee is Permanent " + ispermanent);
	}

}


