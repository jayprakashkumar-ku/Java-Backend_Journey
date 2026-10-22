package com.kodewala.constructorPractice01;

public class Product {
	private int productId;
    private String productName;
    private double price;
    private static int productCount = 0;
    
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        productCount++;
    }
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    static void displayProductCount() {
        System.out.println("Total Products: " + productCount);
    }
}
