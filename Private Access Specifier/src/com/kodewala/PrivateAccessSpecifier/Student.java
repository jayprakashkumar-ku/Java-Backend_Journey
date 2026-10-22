package com.kodewala.PrivateAccessSpecifier;

public class Student {
private String name="Jay Prakash Kumar";

void setValue(String name) {
	this.name=name;
}
void display() {
	System.out.println("My name is :"+name);
	
}
public static void main(String args[]) {
	Student s1=new Student();
	s1.display();
}
}
