package com.kodewala.phonepay11;

import java.util.Scanner;

public class PhonrPeTransactionLoop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Number of transaction(1-5) ");
	int count=sc.nextInt();
	
	//Validation tranasction count using if else
	if(count<1 || count>5) {
		System.out.println("Invalid transaction count.");
		
	}else {
		long totalAmount = 0;
		int successfulPayment = 0 ;
		int failedPayment = 0;
		
		//for loop: each tramsaction is processed once
		for(int i = 1;i<=count;i++){
		System.out.println("Enter amount for payment " + i + " :");	
		
		long amount =sc.nextLong();
		
		//validate amount before adding it to total
		if(amount <=0)
		{
			System.out.println("Invalid amount");
			failedPayment++;
		}
		else {
			totalAmount = totalAmount+amount;
			successfulPayment++;
		}
		
		 System.out.println("\n--- Transaction Summary ---");
         System.out.println("Successful: " + successfulPayment);
         System.out.println("Rejected: " + failedPayment);
         System.out.println("Total accepted amount: Rs. " + totalAmount);
		}
	}
	sc.close();
}
}
