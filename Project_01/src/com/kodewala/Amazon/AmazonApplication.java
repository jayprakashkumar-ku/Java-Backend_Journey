package com.kodewala.Amazon;

import com.kodewala.Amazon.Order.PrimeOrder;

public class AmazonApplication {

	public static void main(String[] args) {

		/*
		 * Command Line Arguments
		 *
		 * args[0] = Customer ID args[1] = Customer Name args[2] = Order ID args[3] =
		 * Product Name args[4] = Price
		 */

		Integer customerId = Integer.valueOf(args[0]);

		Integer orderId = Integer.valueOf(args[2]);

		Double price = Double.valueOf(args[4]);

		// Prime Customer object
		PrimeCustomer customer = new PrimeCustomer(customerId, args[1], "customer@gmail.com");

		// Array of orders
		Order order=new Order();
		PrimeOrder[] orders = new PrimeOrder[2];

		// Objects
		orders[0] =order.new PrimeOrder(orderId, args[3], price);

		orders[1] =order. new PrimeOrder(1002, "Headphones", 25000);

		// Static method
		Customer.showCompany();

		System.out.println("\n===== CUSTOMER =====");

		customer.displayPrimeCustomer();

		System.out.println("\n===== ORDERS =====");

		// Control flow + Array
		for (int i = 0; i < orders.length; i++) {

			System.out.println("\nOrder " + (i+1));

			orders[i].displayPrimeOrder();
		}

		System.out.println("\nTotal Orders : " + Order.totalOrders);

		// Object becomes eligible for GC
		customer = null;

		System.gc();
	}
}
