package com.kodewala.constructor2;

public class Product {
String product_Name;
double price;
String description;
int quantity;
public Product(String product_Name, double price, String description, int quantity) {
	super();
	this.product_Name = product_Name;
	this.price = price;
	this.description = description;
	this.quantity = quantity;
}
public Product(String product_Name, String description) {
	super();
	this.product_Name = product_Name;
	this.description = description;
}
public Product() {
	super();
	System.out.println("No attributes!!!");
}
public void displayAttributes() {
	System.out.println("Product_Name : "+product_Name);
	System.out.println("Price : "+price);
	System.out.println("Description : "+description);
	System.out.println("Quantity : "+quantity);
	
}

}
