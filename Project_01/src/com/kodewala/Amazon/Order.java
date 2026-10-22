package com.kodewala.Amazon;

public class Order {
	protected int orderId;
	/**
	 * The order ID is protected so subclasses can use it.
	 */
	protected String productName;
	protected double price;
	private String status;
	/**
	 * Ex: Created Shipped Delivered Cancelled
	 */
	static int totalOrders = 0;

	/**
	 * Q: Why is totalOrders static? Answer: Because it represents a value shared
	 * across all order objects rather than belonging to one particular order.
	 */
	Order() {
		this(0, "Unknown", 0.0);
	}

	Order(int orderId, String productName, double price) {
		this.orderId = orderId;
		this.productName = productName;
		this.price = price;
		// Each line assigns constructor parameters to the current object's variables.
		this.status = "Created";
		//totalOrders++;
	}

	public void displayOrder() {
		System.out.println("Order ID      : " + orderId);
		System.out.println("Product       : " + productName);
		System.out.println("Price         : " + price);
		System.out.println("Status        : " + status);
	}

	class PrimeOrder extends Order {
		private double discount;

		PrimeOrder() {
			this(0, "Unknown", 0.0);
			
		}

		PrimeOrder(int orderId, String productName, double price) {
			super(orderId, productName, price);
			if (price >= 50000) {
				discount = 10;
			} else if (price >= 20000) {
				discount = 5;
			} else {
				discount = 2;
			}
			totalOrders++;
		}

		public void displayPrimeOrder() {

			displayOrder();

			System.out.println("Discount      : " + discount + "%");

		}
	}
}