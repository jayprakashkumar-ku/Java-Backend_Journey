package com.KodeWala.class02;

public class Main {
	public static void main(String[] args) {
		Employees emp1 = new Employees();
		emp1.employeeId = 101;
		emp1.name = "Prakash";
		emp1.salary = 54000;
		emp1.displayDetails();
		System.out.println("------------------------------");
		Employees emp2 = new Employees();
		emp2.employeeId = 102;
		emp2.name = "Kumar";
		emp2.salary = 75000;
		emp2.displayDetails();
		System.out.println("------------------------------");
		Employees emp3 = new Employees();
		emp3.employeeId = 102;
		emp3.name = "JayShree";
		emp3.salary = 60000;
		emp3.displayDetails();
	}
}
