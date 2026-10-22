package com.kodewala.phonepay9;

public class PhonePePaymentData {
public static void main(String[] args) {
	// Transaction ke basic details
    long transactionId = 9876543210L;
    int itemCount = 2;
    double amount = 1500.50;
    boolean paymentSuccessful = true;
    char currencyCode = 'I';
    String status = "PENDING";

    // Payment process complete hone ke baad status update
    status = "SUCCESS";

    // Transaction details display karna
    System.out.println("Transaction ID: " + transactionId);
    System.out.println("Item Count: " + itemCount);
    System.out.println("Amount: Rs. " + amount);
    System.out.println("Currency Code: " + currencyCode);
    System.out.println("Payment Successful: " + paymentSuccessful);
    System.out.println("Status: " + status);
	
}
}
