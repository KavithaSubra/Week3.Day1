package Week3.Day1;

public class StudentDetails {
public void getStudentDetails(int id)
{
	System.out.println("Student ID "+ id);
	}
public void getStudentDetails(String name)
{
	}
public void getStudentDetails(int id, String name)
{
	
	System.out.println("Student ID "+ id+ " and the name is "+ name);
	}
public void getStudentDetails(int id, int age, String name)
{
	System.out.println("Student ID "+ id+ " and the name is "+ name);
	System.out.println("Age "+ age);

	}
public void getStudentDetails(String name, int id)
{
	}
public void getStudentDetails()
{
	}
public static void main(String[] args) {
	StudentDetails stud1 = new StudentDetails();
	stud1.getStudentDetails(100);
	stud1.getStudentDetails(101, "Kavitha");
	stud1.getStudentDetails(102, 40, "Kavi");
}
}
