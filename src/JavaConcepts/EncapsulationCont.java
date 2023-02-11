package JavaConcepts;

public class EncapsulationCont 
{

	public static void main(String[] args)
	{
		EncapsulationConcept ec = new EncapsulationConcept();
		 
		ec.setEmpsalary(10000);
		System.out.println("Salary of employee is " + ec.getEmpsalary());
		
		ec.setCompany("IBM");
		System.out.println("Company name is " + ec.getCompany());
		
	}

}
