package com.kodewala.defaultAccessSpecifier;

public class Student {
	

	    String name = "Rahul";

	    void display() {

	        System.out.println(name);
	    }
	    public static void main(String args[]) {
	    	Student s1=new Student();
	    	s1.display();
	    }
	
}
