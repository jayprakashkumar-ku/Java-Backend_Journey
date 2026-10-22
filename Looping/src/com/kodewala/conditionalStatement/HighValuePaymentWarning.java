package com.kodewala.conditionalStatement;

public class HighValuePaymentWarning {
static final	 long AMOUNT_PAISE=1000000L;
public static void main(String[] args) {
	long paymentAmountPaise=1500000L;
	if(paymentAmountPaise >= AMOUNT_PAISE) {
		System.out.println("High Value Transaction!");
	}
	
	System.out.println("Payment Amount : Rs."+AMOUNT_PAISE/100.0);
	
}
}
