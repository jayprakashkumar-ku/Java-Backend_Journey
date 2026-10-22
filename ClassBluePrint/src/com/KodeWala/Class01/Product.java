package com.KodeWala.Class01;

public class Product {
	String productName;
    int productId;
    double price;
    int quantity;
    
    void displayProduct() {
    	System.out.println("Product: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    
    public static void main(String args[]) {
    	Product p1=new Product();
    	p1.productName="Science Books";
    	p1.productId=101;
    	p1.price=375;
    	p1.quantity=01;
    	p1.displayProduct();
    }
}
