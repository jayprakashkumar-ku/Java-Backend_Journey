package com.KodeWala.Class;

public class Employee {
int employeeID;
String name;
double salary;
String department;

public static void main(String[]args) {
	Employee e1=new Employee();
	Employee e2=new Employee();
	e1.employeeID=101;
	e1.name="Munna";
	e1.salary=45000;
	e1.department="IT";
	
	e2.employeeID=102;
	e2.name="Prakash";
	e2.salary=500000;
	e2.department="CSE";
	
	System.out.println("Employee ID: " + e1.employeeID);
    System.out.println("Employee Name: " + e1.name);
    System.out.println("Salary: " + e1.salary);
    System.out.println("Department: " + e1.department);
     
    System.out.println("-----------------------------------");
    
    System.out.println("Employee ID: " + e2.employeeID);
    System.out.println("Employee Name: " + e2.name);
    System.out.println("Salary: " + e2.salary);
    System.out.println("Department: " + e2.department);
}
}
