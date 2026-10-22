package com.kodewala.Polymorphism2;
class Employee{
public void markIn() {
System.out.println("Employee.markIn().........Employee Marking IN");	
}
}
class HRManager extends Employee{
	@Override
	public void markIn() {
		System.out.println("HRManager.markIn()........HRManager Marking IN");
	}
}
public class Driver {
public static void main(String[] args) {
	/*
	Employee e1=new Employee();
	*/
	
	Employee e2=new Employee();//Parent class can refer child class object
	e2.markIn();//same method will behave differently based on the actual object
	System.out.println(e2.hashCode());
	//1.At the time of compilation,it will check the method's exist in class,
	//Employee
	//2.At the time of execution(While running),it will call the method on actual
	//object
}
}
