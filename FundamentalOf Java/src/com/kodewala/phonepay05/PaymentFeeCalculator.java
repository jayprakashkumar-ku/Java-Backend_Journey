package com.kodewala.phonepay05;

public class PaymentFeeCalculator {
public static void main(String[] args) {
	
	double amount = 2500.00;
    double feeRate = 0.015;
    
    // Percentage fee calculate karna
    double fee = amount * feeRate;
    
    // Original amount aur fee add karna
    double total = amount + fee;
    
    System.out.println("Payment Amount: Rs. " + amount);
    System.out.println("Fee: Rs. " + fee);
    System.out.println("Total Amount: Rs. " + total);
    
}
}
