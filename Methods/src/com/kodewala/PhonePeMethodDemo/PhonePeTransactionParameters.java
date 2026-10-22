package com.kodewala.PhonePeMethodDemo;

	import java.util.Scanner;

	public class PhonePeTransactionParameters {

	    // Parameters receive the transaction details
	    static void displayReceipt(String transactionId, long amount) {
	        System.out.println("\n--- Transaction Receipt ---");
	        System.out.println("Transaction ID: " + transactionId);
	        System.out.println("Amount: Rs. " + amount);
	    }
	    
	    static void displayReceipt(String transactionId, long amount,int age) {
	        System.out.println("\n--- Transaction Receipt ---");
	        System.out.println("Transaction ID: " + transactionId);
	        System.out.println("Amount: Rs. " + amount);
	        System.out.println("Amount: Rs. " + age);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter transaction ID: ");
	        String transactionId = sc.nextLine();

	        System.out.print("Enter payment amount: ");
	        long amount = sc.nextLong();

	        if (amount > 0) {
	            // Pass the values as arguments
	            displayReceipt(transactionId, amount);
	            displayReceipt("AB123",4521);
	            displayReceipt("ABC101",1100, 25);
	        } else {
	            System.out.println("Invalid payment amount.");
	        }

	        sc.close();
	    }
	}

