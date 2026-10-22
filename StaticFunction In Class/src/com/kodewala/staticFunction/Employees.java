package com.kodewala.staticFunction;

public class Employees {
String name;
static void display(Employees e) {
	System.out.println(e.name);
}
public static void main(String[]args)
{
Employees e1=new Employees();
e1.name="Munna";
display(e1);
}
}
