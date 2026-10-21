package com.wipro.sample;

public class Details {
String employeeName;
double salary;
String department;

void displayEmployeeDetails() {
	
	System.out.println("My Name Is: "+ employeeName);
	System.out.println("My Salary Is: "+ salary);
	System.out.println("My Name Is: "+ department);
}
public static void main(String args[])
{
Details d1=new Details();
d1.employeeName="Munna kumar";
d1.salary=10000;
d1.department="CSE";
d1.displayEmployeeDetails();
}
}
