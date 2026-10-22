package com.KodeWala.Class01;

public class Main {
	

	    public static void main(String[] args) {

	        Employee e1 = new Employee();

	        e1.employeeId = 101;
	        e1.name = "Rahul";
	        e1.department = "IT";
	        e1.salary = 30000;

	        Employee e2 = new Employee();

	        e2.employeeId = 102;
	        e2.name = "Amit";
	        e2.department = "HR";
	        e2.salary = 40000;

	        e1.displayDetails();
	        e1.calculateAnnualSalary();

	        System.out.println();

	        e2.displayDetails();
	        e2.calculateAnnualSalary();
	    
	}
}
