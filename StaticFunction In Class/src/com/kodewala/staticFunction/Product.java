package com.kodewala.staticFunction;

public class Product {
	String productName;
	double price;

	static void displayWebsite() {

		System.out.println("Website: ABC Shopping");
	}

	void displayProduct() {

		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
	}

	public static void main(String[] args) {

		Product p1 = new Product();

		p1.productName = "Laptop";
		p1.price = 55000;

		Product p2 = new Product();

		p2.productName = "Mouse";
		p2.price = 800;

		Product.displayWebsite();

		p1.displayProduct();

		System.out.println();

		p2.displayProduct();
	}
}
