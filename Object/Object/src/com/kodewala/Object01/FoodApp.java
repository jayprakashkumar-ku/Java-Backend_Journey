package com.kodewala.Object01;

public class FoodApp {
	 public static void main(String[] args) {

	        Order order1 = new Order();

	        order1.createOrder(
	            501,
	            "Rahul",
	            "Pizza",
	            450
	        );

	        Order order2 = new Order();

	        order2.createOrder(
	            502,
	            "Priya",
	            "Burger",
	            300
	        );

	        Order.displayPlatform();

	        System.out.println();

	        order1.cancelOrder();

	        System.out.println();

	        order1.displayOrder();

	        System.out.println();

	        order2.displayOrder();
	    }
}
