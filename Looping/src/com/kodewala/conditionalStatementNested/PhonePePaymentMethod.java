package com.kodewala.conditionalStatementNested;

public class PhonePePaymentMethod {
public static void main(String[] args) {
	int PaymentMethod =2;
	switch(PaymentMethod) {
	
	case 1:
		System.out.println("Selected Method:UPI Payment");
		break;
	case 2:
		System.out.println("Selected Method : Wallet Payment");
		break;
	case 3:
		System.out.println("Selected Method : Bank Transfer");
		break;
	default:
		System.out.println("Invalid Payment Method!");
	}
}
}
