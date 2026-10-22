package com.kodewala.constructors;

public class Student {
	
	String studentName;
	int rollNumber;
	String course;
	
Student(String _studentName,int _rollNumber,String _course) {
		this.studentName=_studentName;
		this.rollNumber=_rollNumber;
		this.course=_course;
	}
 public static void main( String []args)
 {
	 
	
	Student s1=new Student("Munna Kumar",22068,"CSE");
	System.out.println("Student Name: " + s1.studentName);
    System.out.println("Roll Number: " + s1.rollNumber);
    System.out.println("Course: " + s1.course);
 }
}
