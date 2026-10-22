package com.kodewala.MethodsInClass;

public class CartItem {

	String productName;
	double price;
	int quantity;

	void calculateTotal() {

		double total = price * quantity;

		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Total: " + total);
		System.out.println("----------------");
	}
}
