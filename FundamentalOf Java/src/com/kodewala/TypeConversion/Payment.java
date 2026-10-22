package com.kodewala.TypeConversion;

public class Payment {
public static void main(String[] args) {
	String amount="1500";
	long paymentAmount=Long.parseLong(amount);
	long total= paymentAmount+200;
	System.out.println(total);
}
}
