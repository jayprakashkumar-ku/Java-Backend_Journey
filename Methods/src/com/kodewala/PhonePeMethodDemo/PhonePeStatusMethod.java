package com.kodewala.PhonePeMethodDemo;

import com.kodewala.MethodsInClass.mainCartItem;

public class PhonePeStatusMethod {
	static void displayPaymentStatus(String status) {
		System.out.println("Payments Status !"+status);
	}
public static void main(String[] args) {
	displayPaymentStatus("SUCCESS");
	displayPaymentStatus("PENDING");
	displayPaymentStatus("FAILED");
}
}
