package com.kodewala.PaymentAmountCalculator;

public class TransactionReferance {
public static void main(String[] args) {
	String transactionId = "TXN620822104068";
	String customerName = "Rahul Sharma";
	long amountPaise =250000L;
	boolean paymentSuccessful = true;
	
	int transactionCount =1;
	
    System.out.println("Transaction ID: " + transactionId);
    System.out.println("Customer: " + customerName);
    System.out.println("Amount: Rs. " + amountPaise / 100.0);
    System.out.println("Successful: " + paymentSuccessful);
    System.out.println("Transaction Count: " + transactionCount);

}
}
