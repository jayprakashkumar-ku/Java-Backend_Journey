package com.kodewala.PaymentAmountCalculator;

public class CashBackCalculation {
public static void main(String[] args) {
	long paymentPaisa = 120000;
	int cashBackPercent=2 ; //2%
	
	long cashBackPaise=paymentPaisa*cashBackPercent/100;
	System.out.println("Payment : Rs. "+paymentPaisa/100);
	System.out.println("Cashback Rate : "+cashBackPercent +"%");
	System.out.println("Cashback : Rs. "+cashBackPaise/100.0);
}
}
