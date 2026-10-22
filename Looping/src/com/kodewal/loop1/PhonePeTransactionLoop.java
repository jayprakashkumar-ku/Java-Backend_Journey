package com.kodewal.loop1;

import java.util.Scanner;

public class PhonePeTransactionLoop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of Transaction(1-5)!");
	int count=sc.nextInt();
if(count < 0 || count>5)
{
	System.out.println("Invalid Transaction Count!");
	
	}
else {
	long totalAmount =10;
	int successfulPayments=0;
	int failedPayments=0;
	for(int i=1;i<=count;i++)
	{
		System.out.println("Enter amount for payments "+i+":");
		long amount=sc.nextLong();
		
		if(amount<=0) {
			System.out.println("Invalid amount.");
			failedPayments++;
		}
		else {
			totalAmount=amount +totalAmount;
			successfulPayments++;
			System.out.println("Payment accepted in demo");
		}
	}
	 System.out.println("\n--- Transaction Summary ---");
     System.out.println("Successful: " + successfulPayments);
     System.out.println("Rejected: " + failedPayments);
     System.out.println("Total accepted amount: Rs. " + totalAmount);
 
}
sc.close();
}
}
