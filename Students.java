package Week3.Day1;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Output when id is passed");
		System.out.println("Student ID is "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Output when id and name are passed");
		System.out.println("Student ID is "+id);
		System.out.println("Student Name is "+name);
	}
	public void getStudentInfo(String email, String phone)
	{
		System.out.println("Output when email and phone are passed");
		System.out.println("Student email is "+email);
		System.out.println("Student phone is "+phone);
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(100);
		stud.getStudentInfo(101, "Mary");
		stud.getStudentInfo("abc@xyz.com", "9988776655");
		
	}

}
