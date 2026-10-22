package com.kodewala.constructors;

public class Employee {
	String name;
	double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee : "+name);
		System.out.println("Salary : "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee=new Employee("Ashok Prasad",75000);
Employee employee1=new Employee("Mukesh Kumar",45000);
employee.display();
employee1.display();
	}

}
