package com.kodewala.conditionalStatementNested;

public class KYCAmountValidation {
	static final long MIN_AMOUNT_PAISE=100L;
	static final long MAX_AMOUNT_PAISE=10000000L;
public static void main(String[] args) {
	long amountPaise=50000L;
	boolean accountVerified=true;
	
	if(amountPaise > MIN_AMOUNT_PAISE && amountPaise < MAX_AMOUNT_PAISE && accountVerified)
	{
		System.out.println("Payment Eligible!");
		System.out.println("Amount "+amountPaise/100.0);
	}
}
}
