package com.kodewala.constructorPractice01;

public class StoreApp {
	public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 55000);
        Product p2 = new Product(2, "Mobile", 25000);
        Product p3 = new Product(3, "Headphones", 3000);

        p1.displayProduct();
        System.out.println();

        p2.displayProduct();
        System.out.println();

        p3.displayProduct();

        Product.displayProductCount();
    }
}
