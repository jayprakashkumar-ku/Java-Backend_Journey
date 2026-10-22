package com.kodewala.staticfunction02;

public class Product1 {
String productId;
String productName;
double price;

static String companyName="Flipkart";
static int product_Count=0;
Product1(){
	product_Count++;
}
void displayProductDetails() {
	System.out.println("Product Id : "+productId);
	System.out.println("Product Name : "+ productName);
	System.out.println("Price : "+price);
}
static void displayCompanyInfo() {

    System.out.println("Company: " + companyName);
    System.out.println("Products Created: " + product_Count);
}

}
