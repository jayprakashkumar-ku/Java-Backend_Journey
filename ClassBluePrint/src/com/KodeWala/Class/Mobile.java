package com.KodeWala.Class;

public class Mobile {
String brand;
String model;
double price;
int ram;

public static void main(String args[])
{
Mobile m1=new Mobile();
m1.brand = "Samsung";
m1.model = "Galaxy";
m1.price = 30000;
m1.ram = 8;

Mobile m2 = new Mobile();

m2.brand = "Apple";
m2.model = "iPhone";
m2.price = 70000;
m2.ram = 6;

Mobile m3 = new Mobile();

m3.brand = "OnePlus";
m3.model = "Nord";
m3.price = 25000;
m3.ram = 8;

System.out.println(m1.brand + " " + m1.model);
System.out.println(m2.brand + " " + m2.model);
System.out.println(m3.brand + " " + m3.model);
}
}
