package com.kodewala.staticfunction02;

public class Students {
int rollNumber;
String name;
String course;


 static String schoolName() {
  String schoolName ="DAV Public School";
	return schoolName;
}
 void displayStudentDetails()
{
	 System.out.println(Students.schoolName());
	 System.out.println("Roll Number: " + rollNumber);
     System.out.println("Name: " + name);
     System.out.println("Course: " + course);
}
}