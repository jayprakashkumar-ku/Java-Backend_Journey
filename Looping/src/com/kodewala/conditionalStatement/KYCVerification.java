package com.kodewala.conditionalStatement;

public class KYCVerification {
public static void main(String[] args) {
	long payment=2000;
	boolean verification=true;
	
	if(verification) {
		System.out.println("Account KYC verified!");
		System.out.println("Payment Eligible!");
	}
	else {
		System.out.println("Need! KYC Verification!");
	}
}
}
