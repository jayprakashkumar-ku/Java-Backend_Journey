package com.kodewala.PaymentAmountCalculator;



public class TransactionFeesCalculator {
public static void main(String[] args) {
	long paymentPaise=250000L;
	long feesPaise=1500L;
	long totalDebitPaise=paymentPaise+feesPaise;
	System.out.println("Payment Amount!: Rs. "+paymentPaise/100.0);
	System.out.println("Processing Fees : Rs. "+feesPaise/100.0);
	
	System.out.println("Total Debit_Amount:Rs. "+totalDebitPaise/100);
}
}
