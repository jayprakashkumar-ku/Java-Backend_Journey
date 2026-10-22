package com.wipro.sample;

 class Employee{
	String name = "Jay Prakash Kumar";
	int salary=100025;
	String department="CSE";
	
	void displayEmployeeDetails() {
		
		System.out.println("My Name Is: "+ name);
		System.out.println("My Salary Is: "+ salary);
		System.out.println("My Name Is: "+ department);
	}
	
 public static void main(String args[]) {
	 Employee emp1=new Employee();
	 emp1.displayEmployeeDetails();
 }
 
}
