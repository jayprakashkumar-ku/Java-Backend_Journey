package com.kodewala.staticFunction;

public class Employee {
String name;
int employeeId;
double salary;

static void displayCompanyName() {
	
	System.out.println("Comapany ABC Technologies");
	
}
void displayEmployee() {
	
	System.out.println("Name : "+name);
	System.out.println("Employee ID : "+employeeId);
	System.out.println("Salary : "+salary);
}

public static void main(String args[]) {
	Employee e1=new Employee();
	e1.name="Munna";
	e1.employeeId=101;
	e1.salary=45000;
	Employee.displayCompanyName();
	e1.displayEmployee();
	
}
}
