package com.kodewala.TypeConversion;

public class CashBack {
	public static void main(String[] args) {
		
	
String amount="1800";
int cashBack=5;

long amount_Con=Long.parseLong(amount);
long cash_Con=cashBack;

long cashBackCalculation=amount_Con*cash_Con/100;
long totalcash=amount_Con-cashBackCalculation;
System.out.println("cashBack In Rupees ."+cashBackCalculation);
System.out.println("Total Amount !"+totalcash);
}
}
