package com.kodewala.phonepay10;

import java.util.Scanner;

public class PhonePeBill {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Transaction ID");
	long transactionId=sc.nextLong();
	
	System.out.println("Amount : ");
	double amount=sc.nextDouble();
	
	System.out.println("Service fees : ");
	double fees=sc.nextDouble();
	
	double total=amount +fees;
	
    System.out.println("Transaction: " + transactionId);
    System.out.println("Total: Rs. " + total);

    sc.close();

}
}
