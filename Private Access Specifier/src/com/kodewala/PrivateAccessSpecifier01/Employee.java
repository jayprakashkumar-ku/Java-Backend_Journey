package com.kodewala.PrivateAccessSpecifier01;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;

	private static String companyName = "TechSolutions";
	void createEmployee(int id,String name,double employeeSalary,String dept) {

	        employeeId = id;
	        employeeName = name;
	        salary = employeeSalary;
	        department = dept;
	    }
	void increaseSalary(double percentage) {
		salary=salary+(salary*percentage/100);
	}
	 void displayEmployee() {

	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name: " + employeeName);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
	static void displayCompany() {

        System.out.println("Company: " + companyName);
    }
	
}
