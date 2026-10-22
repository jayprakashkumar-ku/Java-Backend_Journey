package com.kodewala.conditionalStatement;

public class MinimumPaymentRule {
	 static final long MINIMUM_PAYMENT=100;

public static void main(String[] args) {
	long amountPaise=50000;
	
	if(amountPaise >= MINIMUM_PAYMENT) {
		System.out.println("Payment Approval");
	}
	else {
		System.out.println("Not Approved!");
	}
	}
}
