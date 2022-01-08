package Week3.Day1;

public class EmployeeDetails {
	
	int empId;
	static String empName;
	String compName;
	
	EmployeeDetails()
	{
		this(1002,"Mary","DEF");
		System.out.println("Default constructor");
		empId = 10000;
	    empName = "Kavi";
	}
	
	public static EmployeeDetails(int id, String name, String company)
	{
		System.out.println("Parametrized constructor");
		this.empId = id;
		this.empName = name;
		this.compName  = company;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
	}
	public void getEmployeeDetails2()
	{
		System.out.println("Employee Details2");
	}
	
	
public static void main(String[] args) {
	EmployeeDetails empDetails = new EmployeeDetails();
	empDetails.getEmployeeDetails();
	System.out.println(empDetails.empId);
	System.out.println(empDetails.empName);
	EmployeeDetails empDetails1 = new EmployeeDetails(50,"KavithaS","ABC");
	System.out.println(empDetails1.compName);
	System.out.println(empDetails.empName);
	System.out.println(empDetails1.empName);
	System.out.println(empDetails1.empId);
}
}
