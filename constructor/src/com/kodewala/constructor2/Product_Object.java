package com.kodewala.constructor2;

public class Product_Object {
public static void main(String[] args) {
	Product product=new Product("IPhone 15", 150000, "RAM 4 128 GB ROM", 2);
	product.displayAttributes();
	System.out.println("=============================================");
	Product product1=new Product("Laptop", "Cool");
	product1.displayAttributes();
	System.out.println("=============================================");
	Product p2=new Product();
			p2.displayAttributes();
}
}
