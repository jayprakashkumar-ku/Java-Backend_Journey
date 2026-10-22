package com.kodewala.ProductionBased;

public class PaymentConfiguration {

	static final long MIN_PAYMENT_PAISE=100;
	static final long MAX_PAYMENT_PAISE=10000000;
	static final long DAILY_LIMIT_PAISE=20000000;
	public static void main(String[] args) {
		
		long paymentPaise=500000;
		boolean paymentAllowed=paymentPaise>=MIN_PAYMENT_PAISE &&paymentPaise <= MAX_PAYMENT_PAISE;
		
		System.out.println("Payment Amount : Rs. "+paymentPaise/100.0);
		System.out.println("Minimum Limit: Rs. " + MIN_PAYMENT_PAISE / 100.0);
        System.out.println("Maximum Limit: Rs. " + MAX_PAYMENT_PAISE / 100.0);
        System.out.println("Daily Limit: Rs. " + DAILY_LIMIT_PAISE / 100.0);
        System.out.println("Payment Allowed: " + paymentAllowed);

	}
}

