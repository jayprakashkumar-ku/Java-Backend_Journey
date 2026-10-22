package com.kodewala.publicSpeciefier01;

public class Product {
public int productId;
public String productName;

private double price;

public static String comapanyName ="Amazon";

public Product(int productId,String productName,double price) {
	this.productId=productId;
	this.productName=productName;
	this.price=price;
}
public void displayProduct() {
	System.out.println("Product ID : "+productId);
	System.out.println("Product_Name : "+productName);
	System.out.println("Product Price : "+price);
}
public void updatePrice(double newPrice)
{
price=newPrice;	
}
public static void displayCompany() {
	System.out.println("Comapny : "+comapanyName);
}
}
