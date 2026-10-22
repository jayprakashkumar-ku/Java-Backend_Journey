package com.kodewala.MethodsInClass;

public class Employee {
String name;
String employeeId;
double salary;

void displayDetails() {
	System.out.println("Name : "+name);
	System.out.println("employeeId : "+employeeId);
	System.out.println("Salary : "+salary);
	
}
public static void main(String args[]) {
	Employee e1=new Employee();
	
	
	e1.name="Jay Prakash Kumar";
	e1.employeeId="101";
	e1.salary=87000;
	
	e1.displayDetails();
}
}
