package com.kodewala.phonepay05;

public class PaymentValidation {
public static void main(String[] args) {
	double amount = 500.00;
	
	//Positive amount hi valid hai
	boolean isValid=amount > 0;
	
	System.out.println("Amount : "+amount);
	System.out.println("Payment Valid : "+isValid);
}
}
