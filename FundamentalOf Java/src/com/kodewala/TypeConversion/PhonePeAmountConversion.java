package com.kodewala.TypeConversion;

public class PhonePeAmountConversion {
public static void main(String[] args) {
	String enteredAmount="1500";
	long paymentAmount = Long.parseLong(enteredAmount);
	
	long transactionFees=10;
	
	long totalAmount = paymentAmount +transactionFees;
	
	String receiptAmount=String.valueOf(totalAmount);
	
	System.out.println("Payment Amount: Rs. " + paymentAmount);
    System.out.println("Transaction Fee: Rs. " + transactionFees);
    System.out.println("Total Amount: Rs. " + receiptAmount);
}
}
