package com.kodewala.constructors;

public class Students {
	String name; 
	int rollNumber;
	String course;
	
	Students(String _name,int _rollNumber,String _course){
		this.name=_name;
		this.rollNumber=_rollNumber;
		this.course=_course;
	}
	void display() {
		System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
	}
public static void main(String[] args) {
	  Students s = new Students("Amit", 101, "Java");

      s.display();
}
}
