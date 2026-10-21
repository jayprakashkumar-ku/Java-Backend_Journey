package com.kodewala.staticMember;

public class Mobile {
String model;
int ram;
String color;
int price;
 static String mobile_Brand;

static void displayDetails(Mobile m) {
	System.out.println("Mobile_Brand : "+mobile_Brand);
	System.out.println("model :  "+m.model);
	System.out.println("RAM : "+m.ram);
	System.out.println("Colour : "+m.color);
	System.out.println("Price : "+m.price);
}

public static void main (String args[]) {
	Mobile m1=new Mobile();
	m1.model="Vivo T1 5G";
	m1.ram=8;
	m1.color="Black";
	m1.price=18500;
	mobile_Brand="Vivo";
	displayDetails(m1);
	
	System.out.println("----------------------------");
	
	Mobile m2=new Mobile();
	m2.model="Vivo Y11";
	m2.ram=4;
	m2.color="Silver";
	m2.price=12500;
	
	displayDetails(m2);
	System.out.println("----------------------------");
	
	Mobile m3=new Mobile();
	m3.model="Vivo T2x 5G";
	m3.ram=6;
	m3.color="Gray";
	m3.price=20200;
	displayDetails(m3);
}
}
