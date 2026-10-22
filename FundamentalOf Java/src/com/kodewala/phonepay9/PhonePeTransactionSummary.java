package com.kodewala.phonepay9;

public class PhonePeTransactionSummary {
public static void main(String[] args) {
	long transactionId = 7001001L;
    double amount = 2500.00;
    double serviceFee = 15.00;

    double total = amount + serviceFee;

    System.out.println("Transaction ID: " + transactionId);
    System.out.println("Payment Amount: Rs. " + amount);
    System.out.println("Service Fee: Rs. " + serviceFee);
    System.out.println("Total: Rs. " + total);
}
}
