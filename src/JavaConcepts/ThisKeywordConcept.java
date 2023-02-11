package JavaConcepts;

public class ThisKeywordConcept
{
	static int empid = 002;
	static String name = "Shruti";
	static String addr = "Mumbai";
	
	public static void main(String[] args)
	{
		ThisKeywordConcept th = new ThisKeywordConcept();
		th.Emp1(empid,name,addr);
		th.Emp1(001,"Aditi","Pune");
	}
	public void Emp1(int empid, String name, String addr)
	{
		this.empid = empid;
		this.name = name;
		this.addr = addr;
		
		System.out.println("Employee id is " + empid + "Name of emp is " + name + " " + "Address of Employee is " + addr);
	}

}
