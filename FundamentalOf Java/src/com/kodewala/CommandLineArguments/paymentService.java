package com.kodewala.CommandLineArguments;

public class paymentService {
public static void main(String[] args) {
	if(args.length!=2) {
		System.out.println("Usage: java PaymentService <ENV> <AMOUNT>");
		return;
	}
		String environment = args[0];
		long amount;
		try {
			amount=Long.parseLong(args[1]);
		}catch(NumberFormatException e) {
			System.out.println("Error: Amount must be a whole number.");
		return;
		}
		  if (amount < 1) {
	            System.out.println("Error: Amount must be positive.");
	            return;
	        }

	        if (!environment.equals("PROD")
	                && !environment.equals("TEST")) {
	            System.out.println("Error: Invalid environment.");
	            return;
	        }

	        // Valid input ke baad service summary
	        System.out.println("Environment: " + environment);
	        System.out.println("Payment Amount: Rs. " + amount);
	        System.out.println("Status: READY");
	    }
	
	}


