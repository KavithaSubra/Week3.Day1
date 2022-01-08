package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student name printed from Student Class in student package");
	}
	public void studentDept()
	{
		System.out.println("Student Department printed from Student Class in student package");
	}
	public void studentId()
	{
		System.out.println("Student ID printed from Student Class in student package");
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.deptName();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
	}

}
