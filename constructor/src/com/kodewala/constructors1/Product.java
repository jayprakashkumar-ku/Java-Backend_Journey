package com.kodewala.constructors1;

public class Product {
String productName;
int price;
String description;
byte quantity;

Product(String _productName,int _price,String _description,byte _quantity){
	this.productName=_productName;
	this.price=_price;
	this.description=_description;
	this.quantity=_quantity;
}
Product(String _productName,String _description) {
	// TODO Auto-generated constructor stub
this.productName=_productName;
this.description=_description;
}
Product(){
	System.out.println("Sorry No Attributes Selected!!");
}
void displayProductDetails(){
	System.out.println("Product_Name : "+productName);
	System.out.println("Price : "+price);
	System.out.println("Description : "+description);
	System.out.println("Quantity : "+quantity);
}
}
