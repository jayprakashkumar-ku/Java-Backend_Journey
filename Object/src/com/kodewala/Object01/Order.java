package com.kodewala.Object01;

public class Order {
	 private int orderId;
	    private String customerName;
	    private String foodItem;
	    private double amount;
	    private String status;
	    
	    private static String platformName = "QuickFood";
	    void createOrder(int id,String customer,String food,double price) {
	            orderId = id;
	            customerName = customer;
	            foodItem = food;
	            amount = price;
	            status = "PLACED";
	        }
	    void cancelOrder() {

	        if (status.equals("PLACED")) {
	            status = "CANCELLED";
	            System.out.println(
	                "Order " + orderId + " cancelled."
	            );
	        }}
	    void displayOrder() {

	        System.out.println("Order ID: " + orderId);
	        System.out.println("Customer: " + customerName);
	        System.out.println("Food: " + foodItem);
	        System.out.println("Amount: " + amount);
	        System.out.println("Status: " + status);
	    }
	    static void displayPlatform() {

	        System.out.println("Platform: " + platformName);
	    }
}
