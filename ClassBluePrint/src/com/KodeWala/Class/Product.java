package com.KodeWala.Class;

public class Product {
	 int productId;
	    String productName;
	    double price;
	    int quantity;

	    public static void main(String[] args) {

	        Product p1 = new Product();

	        p1.productId = 101;
	        p1.productName = "Laptop";
	        p1.price = 55000;
	        p1.quantity = 2;

	        Product p2 = new Product();

	        p2.productId = 102;
	        p2.productName = "Mouse";
	        p2.price = 800;
	        p2.quantity = 5;
	        
	        System.out.println(p1.productName+" "+p1.price);
	        System.out.println(p2.productName+" "+p1.price);
	    }
}
