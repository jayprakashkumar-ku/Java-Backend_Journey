package com.kodewala.staticMember;

public class Employee {
String name;
int employeeId;
double salary;

static String companyName="ABC Technologies";
void displayEmployee() {
	System.out.println("Name : "+name);
	System.out.println("employeeID: "+employeeId);
	System.out.println("Salary : "+salary);
	System.out.println("Company Name  : "+companyName);
}

public static void main(String args[]) {
	
	Employee e1=new Employee();
	Employee e2 = new Employee();
    Employee e3 = new Employee();
    
	e1.name="Priyanka";
	e1.employeeId=101;
	e1.salary=75000;
	
	e1.displayEmployee();
	
	
	  e2.name = "Amit";
      e2.employeeId = 102;
      e2.salary = 50000;

      e3.name = "Priya";
      e3.employeeId = 103;
      e3.salary = 55000;
      e2.displayEmployee();
      e3.displayEmployee();
}
}
