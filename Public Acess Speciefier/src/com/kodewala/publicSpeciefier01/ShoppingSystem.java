package com.kodewala.publicSpeciefier01;



public class ShoppingSystem {
public static void main(String[] args) {
	Product p1=new Product(101,"Laptop",55000);
	Product p2=new Product(102,"Mobile",25000);
Product.displayCompany();
//public members can be accessed
System.out.println(p1.productId);
System.out.println(p2.productName);

// public method
p1.displayProduct();
p2.displayProduct();

// controlled modification of private price
p1.updatePrice(52000);

System.out.println("After Price Update:");

p1.displayProduct();
}
}
