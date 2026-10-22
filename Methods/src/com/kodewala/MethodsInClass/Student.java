package com.kodewala.MethodsInClass;

public class Student {
String studentName;
int rollNumber;
int marks;

void displayResult() {
	
	System.out.println("Name :"+studentName);
	System.out.println("RollNumber :"+rollNumber);
	System.out.println("marks :"+marks);
	if (marks>=40) {
		System.out.println("Result : Pass");
		
	}
	else {
		System.out.println("Result : Fail");
	}
}
public static void main(String[]aargs) {
	
	Student s1=new Student();
	s1.studentName="Rahul kumar";
	s1.rollNumber=68;
	s1.marks=40;
	s1.displayResult();
}
}
