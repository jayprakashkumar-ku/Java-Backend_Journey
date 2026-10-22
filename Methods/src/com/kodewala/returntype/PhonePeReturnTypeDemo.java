package com.kodewala.returntype;

import java.util.Scanner;

public class PhonePeReturnTypeDemo {
	
	static long calculatedTotal(long amount,long fees) {
		return amount+fees;
	}
	
	static boolean isValidPayment(long amount,long fees)
	{
		return amount>0 &&fees>=0;
	}
	
	static void displayReceipt(String transactionId,long amount,long fees,long total) {
		 System.out.println("\n--- PhonePe Receipt ---");
	        System.out.println("Transaction ID: " + transactionId);
	        System.out.println("Payment Amount: Rs. " + amount);
	        System.out.println("Service Fee: Rs. " + fees);
	        System.out.println("Total Amount: Rs. " + total);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Transactions ID: ");
	String transactionId = sc.nextLine();
	
	 System.out.print("Enter payment amount: ");
     long amount = sc.nextLong();

     System.out.print("Enter service fee: ");
     long fee = sc.nextLong();

     if(isValidPayment(amount, fee)) {
    	 long total=calculatedTotal(amount, fee);
    	 displayReceipt(transactionId, amount, fee, total);
     }else {
    	 System.out.println("Invalid payment details!");
     }
     sc.close();
}
}
