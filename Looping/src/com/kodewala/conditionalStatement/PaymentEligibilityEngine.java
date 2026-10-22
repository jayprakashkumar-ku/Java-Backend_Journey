package com.kodewala.conditionalStatement;

public class PaymentEligibilityEngine {
	static final long MIN_PAYMENT_PAISE=100L;
	static final long MAX_PAYMENT_PAISE=10000000L;
public static void main(String[] args) {
long amountPaise=200000L;
boolean verification=true;

if(amountPaise >= MIN_PAYMENT_PAISE && amountPaise <=MAX_PAYMENT_PAISE && verification) {
	System.out.println("Payment Eligible!");
	System.out.println("Amount : Rs."+amountPaise/100.0);
}
}
}
