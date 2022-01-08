package Week3.Day1;

import java.io.PrintStream;

public class LearnStatic {
	
	static String name = "Raku";
	int id = 5;
	
	public static void getDetails()
	{
		System.out.println("Static method");
		System.out.println(LearnStatic.name);
		System.out.println(new LearnStatic().id);
	}
	
	public static void main(String[] args) {
		
		/* LearnStatic ls = new LearnStatic();
		 * ls.getdetails();
		 */
		
		LearnStatic.getDetails();
		name = "Raju";
		System.out.println(name);
		
	}

}
