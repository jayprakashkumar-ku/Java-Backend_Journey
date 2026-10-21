package com.kodewala.staticfunction02;

public class ECommerce {
public static void main(String[] args) {
	Product p1=new Product();
	
	p1.productId=101;
	p1.productName="IPhone12 ";
	Product.price=100000;
	p1.displayProductDetails();
	System.out.println("---------------------");
	
	Product p2=new Product();
	p2.productId=102;
	p2.productName="Samsung Galaxy ";
	Product.price=35999;
	p2.displayProductDetails();
	System.out.println("---------------------");
	
	Product p3=new Product();
	p3.productId=101;
	p3.productName="Vivo T15G ";
	Product.price=18999;
	p3.displayProductDetails();
	System.out.println("---------------------");
	
}
}
