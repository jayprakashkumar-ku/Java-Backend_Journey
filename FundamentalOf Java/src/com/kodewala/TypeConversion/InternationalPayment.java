package com.kodewala.TypeConversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InternationalPayment {
public static void main(String[] args) {
	double usd = 100.50;
	double rate = 83.25;
	
	double inr= usd * rate;
	System.out.println("Using double : "+inr);
	
	BigDecimal usdAmount = new BigDecimal("100.50");
	BigDecimal exchangeRate= new BigDecimal("83.25");
	
	BigDecimal exactInr=usdAmount.multiply(exchangeRate);
	
	BigDecimal roundedInr = exactInr.setScale(2,RoundingMode.HALF_UP);
	
	System.out.println("Exact INR : "+exactInr);
	System.out.println("Rounded INR : "+roundedInr);
}
}
