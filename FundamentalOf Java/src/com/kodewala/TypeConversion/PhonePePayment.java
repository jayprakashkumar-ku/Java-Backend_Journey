package com.kodewala.TypeConversion;

public class PhonePePayment {
	public static void main(String[] args) {
		
	
String amount="5000";
String fee="30";

Long _amount=Long.valueOf(amount);
Long _fee=Long.valueOf(fee);

Long total=Math.addExact(_amount, _fee);
System.out.println("Total : "+total);

}}
