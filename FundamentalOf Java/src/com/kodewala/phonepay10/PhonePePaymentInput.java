package com.kodewala.phonepay10;

import java.security.Provider.Service;
import java.util.Scanner;

public class PhonePePaymentInput {
public static void main(String[] args) {
	
	//Keyboard se input lene ke liyea Scanner object
	Scanner sc=new Scanner(System.in);
	
	//previous topic:variables,data types and literals
	System.out.println("Enter Transaction ID:");
	long transactionId=sc.nextLong();
	
	System.out.println("Enter payment amount:");
	double amount=sc.nextDouble();
	
	System.out.print("Enter service fee: ");
    double serviceFee = sc.nextDouble();
	
	//Previous topic : Arithmetic operator
	double total=amount + serviceFee;
	
	// Previous topic: widening conversion (int to double)
    int transactionCount = 1;
    double reportCount = transactionCount;


    // Payment summary display
    System.out.println("\n--- PhonePe Payment Summary ---");
    System.out.println("Transaction ID: " + transactionId);
    System.out.println("Payment Amount: Rs. " + amount);
    System.out.println("Service Fee: Rs. " + serviceFee);
    System.out.println("Total Amount: Rs. " + total);
    System.out.println("Report Count: " + reportCount);

    // Scanner close karna
    sc.close();
}
}
