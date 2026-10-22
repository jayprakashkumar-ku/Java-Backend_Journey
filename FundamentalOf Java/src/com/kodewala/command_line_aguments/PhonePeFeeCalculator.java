package com.kodewala.command_line_aguments;

public class PhonePeFeeCalculator {
public static void main(String[] args) {
	double totalFees=0;
	if(args.length!=2)
	{
		System.out.println("Enter the amount and fees!!");
		return;
	}
	long amount=Long.parseLong(args[0]);
	long fees=Long.parseLong(args[1]);
	
	if(amount>=0 || fees>=0)
	{
		totalFees=amount+fees;
	}
	else {
		System.out.println("Enter the valid amount!!");
	}
	System.out.println("Payment : Rs. "+amount);
	System.out.println("Fees: Rs."+fees);
	System.out.println("Total Fees : "+totalFees);
}
}
