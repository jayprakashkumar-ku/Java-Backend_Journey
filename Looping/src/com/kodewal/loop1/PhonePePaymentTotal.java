package com.kodewal.loop1;

import java.util.Scanner;

public class PhonePePaymentTotal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long total=0;
	int invalidcount=0;;
	for(int i=1 ;i<=4;i++) {
		System.out.println("Enter Payment "+i+":");
		long amount=sc.nextLong();
		
		if(amount>0) {
			total+=amount;
		}
		else {
			invalidcount++;
		}
	}
	 System.out.println("Total accepted amount: Rs. " + total);
     System.out.println("Invalid payments: " + invalidcount);

     sc.close();
}
}
