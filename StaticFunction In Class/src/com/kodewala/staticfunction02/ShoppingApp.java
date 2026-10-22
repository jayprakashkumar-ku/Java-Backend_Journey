package com.kodewala.staticfunction02;

public class ShoppingApp {
	public static void main(String[] args) {

        Product1 product01 = new Product1();

        product01.productId = "101";
        product01.productName = "Laptop";
        product01.price = 60000;

        Product1 product2 = new Product1();

        product2.productId = "102";
        product2.productName = "Headphones";
        product2.price = 3000;
        
        Product1 product3 = new Product1();

        product3.productId = "103";
        product3.productName = "Keyboard";
        product3.price = 1500;

        product01.displayProductDetails();

        System.out.println();

        product2.displayProductDetails();

        System.out.println();

        product3.displayProductDetails();

        System.out.println();

        Product1.displayCompanyInfo();
	}
}
