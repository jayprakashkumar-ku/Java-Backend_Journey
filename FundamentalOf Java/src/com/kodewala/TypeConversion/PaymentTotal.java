package com.kodewala.TypeConversion;

public class PaymentTotal {
public static void main(String[] args) {
	String paymentAmount="2500";
	long fee=25;
	
	long amount=Long.parseLong(paymentAmount);
	
	long total_Amount=amount+fee;
	System.out.println("Total Amount is Rs. "+total_Amount);
}
}
