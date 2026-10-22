package com.kodewala.Inheritance;

public class InheritanceDemo {
public static void main(String[] args) {
	Child obj=new Child();
	obj.display();
	obj.show();
}
}
class Parent{
	void show() {
		System.out.println("Parent method!");
	}
}
class Child extends Parent
{
void display() {
	System.out.println("Child methods!");
}	
}