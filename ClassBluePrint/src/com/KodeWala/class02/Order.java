package com.KodeWala.class02;

public class Order {
String orderId;
String customerName;
String foodItem;
double price;


void displayOrder() {
	 System.out.println("Order ID: " + orderId);
     System.out.println("Customer: " + customerName);
     System.out.println("Food: " + foodItem);
     System.out.println("Price: " + price);
}
double calculateFinalAmount()
{
double deliveryCharge=50;
return price+deliveryCharge;
}
}
