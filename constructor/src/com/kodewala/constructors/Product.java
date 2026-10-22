package com.kodewala.constructors;

public class Product {
	String productName;
	double price;

	Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	void display() {
        System.out.println(productName + " : " + price);
    }
	public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);

        p1.display();
        p2.display();
    }
}
