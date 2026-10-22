package com.kodewal.breakContinue;

import java.util.Scanner;

public class PhonePeTransactionSearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[]transactionIds={101,102,103,104,105};
	System.out.println("Enter transaction ID:");
	int target =sc.nextInt();
	boolean found=false;
	
	for(int userIds=0;userIds<=transactionIds.length;userIds++)
	{
		if(transactionIds[userIds]==target) {
		System.out.println("Found at Position: "+(userIds+1));
		found=true;
		break;
	}
		
		}
	if(!found)
	{
		System.out.println("Transaction Ids not found!");
	}
	
	sc.close();
}
}
