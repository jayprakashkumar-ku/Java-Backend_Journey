package com.kodewala.PhonePeMethodDemo;

import java.util.Scanner;
public class PhonePeMethodDemo {
static void displayReceipt(String transactionId,double amount) {
	 System.out.println("\n--- Payment Receipt ---");
     System.out.println("Transaction ID: " + transactionId);
     System.out.println("Amount: Rs. " + amount);
}


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=2;i++) {
	System.out.println("Enter Transaction ID: ");
	String transactionId=sc.nextLine();
	
	System.out.println("Enter payment amount!");
	double amount=sc.nextDouble();
	sc.nextLine();
	
	if(amount>0) {
		displayReceipt(transactionId,amount);
		System.out.println("Demo payment accepted!");
	}
	else {
		System.out.println("Invalid payments amount!");
	}
	
	}
	
	sc.close();
}
}
