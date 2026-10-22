package com.kodewala.MethodsInClass;

public class Product {
	 int productId;
	    String productName;
	    double price;
	    int quantity;

	    void displayProduct() {

	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println("Quantity: " + quantity);
	    }

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

	        p1.displayProduct();

	        System.out.println();

	        p2.displayProduct();
	    }
}
