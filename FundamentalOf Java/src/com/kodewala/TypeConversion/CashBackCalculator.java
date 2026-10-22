package com.kodewala.TypeConversion;

public class CashBackCalculator {
public static void main(String[] args) {
	String amount="2400";
	int rate=5;
	
	int _amount=Integer.parseInt(amount);
	int cashBack=Math.multiplyExact(rate, _amount)/100;
	int total=Math.addExact(_amount, cashBack);
	System.out.println(cashBack);
	System.out.println(total);
	
	
}
}
