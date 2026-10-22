package com.kodewala.staticfunction02;

public class College {
public static void main(String[] args) {
	
	Students std1=new Students();
	std1.rollNumber=01;
	std1.name="Rahul Kumar";
	std1.course="PCM";
	
	
	Students std2=new Students();
	std2.rollNumber=02;
	std2.name="Priyanka Kumari";
	std2.course="C++";
	
	Students std3=new Students();
	std3.rollNumber=03;
	std3.name="Suraj Kumar";
	std3.course="java";
	
	
	//System.out.println(Students.schoolName());
	
	std1.displayStudentDetails();
	System.out.println("---------------");
	
	std2.displayStudentDetails();
	System.out.println("---------------");
	
	std3.displayStudentDetails();
	
}
}
