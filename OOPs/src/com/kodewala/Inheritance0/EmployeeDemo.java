package com.kodewala.Inheritance0;
class Employee{
	String name;
	int employeeId;
	
	Employee(String name,int employeeId){
		this.name = name;
		this.employeeId=employeeId;
		
		System.out.println("Employee constructor Executed!");
		
	}
}
class Developer extends Employee{
	String programmingLanguage;
	Developer(String name,int employeeId,String language)
	{
		super(name , employeeId);
		this.programmingLanguage=language;
		System.out.println("Developer constructor Executed!");
	}
	void dsiplay()
	{
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Language: " + programmingLanguage);

	}
}
public class EmployeeDemo {
public static void main(String[] args) {
	Developer developer=new Developer("Munna Kumar",104,"Java");
	developer.dsiplay();
}
}
