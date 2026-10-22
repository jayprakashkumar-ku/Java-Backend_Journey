package com.kodewala.sameclassconstructor;

public class Student {

	Student(){
		this(22);
		System.out.println("Age of Student : A = ");
	}
	Student(int studentAge){
		this("munna");
		System.out.println("Name B := " );
	}
	Student(String name)
	{
		System.out.println("C ="+name);
	}
	
	public static void main(String[] args) {
		Student std=new Student();
	}
	
}
