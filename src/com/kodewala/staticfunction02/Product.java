package com.kodewala.staticfunction02;

public class Product {
	int productId;
    String productName;
    static double price;
    static double total;
    static void gstDisplay()
    {
    	System.out.println("GST On Each Product is 18%");
    }
    void displayProductDetails()
    {
    Product.totalAmountIncludingGst();
    	System.out.println("Product Id : "+productId);
     	System.out.println("Product Name : "+productName);
     	System.out.println("Product Price : "+price);
    }
    static double totalAmountIncludingGst() {
    System.out.println("GST Amount is : "+ price*18/100);
    total=price+(price*18/100);
    System.out.println( "Total price of the Product After GST Including Is : "+total);
    	return total;
    }
}
