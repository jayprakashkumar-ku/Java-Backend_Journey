package com.KodeWala.Class01;

public class Employee {
	int employeeId;
    String name;
    String department;
    double salary;
    
    void displayDetails() {
    	 System.out.println("Employee ID: " + employeeId);
         System.out.println("Name: " + name);
         System.out.println("Department: " + department);
         System.out.println("Salary: " + salary);
    }
    void calculateAnnualSalary() {

        double annualSalary = salary * 12;

        System.out.println("Annual Salary: " + annualSalary);
    } 
}
