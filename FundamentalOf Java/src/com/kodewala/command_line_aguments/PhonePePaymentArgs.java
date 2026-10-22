package com.kodewala.command_line_aguments;

public class PhonePePaymentArgs {
public static void main(String[] args) {
	if(args.length !=2) {
		System.out.println("Usage: java PhonePePaymentArgs <transactionId> <amount>");
		return;
	}
	String transactionId=args[0];
	long amount=Long.parseLong(args[1]);
	
	if(amount <=0 )
	{
		System.out.println("Invalid Payment amount.");
	}
	else {
		System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Demo payment accepted.");

	}
}
}
