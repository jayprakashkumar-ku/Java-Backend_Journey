package com.kodewala.phonepay07;

public class Payment {
private double amount;

Payment(double amount){
	this.amount=amount;
}

void showPayment()
{
System.out.println("Payment Amount : Rs." + amount);	
}
}
