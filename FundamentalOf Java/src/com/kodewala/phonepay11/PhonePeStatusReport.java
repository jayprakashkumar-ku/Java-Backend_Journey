package com.kodewala.phonepay11;

import java.util.Scanner;

public class PhonePeStatusReport {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Transaction ID: ");
	        long transactionId = sc.nextLong();
	        // nextLong ke baad line separator consume karna
	        sc.nextLine();

	        System.out.print("Status: ");
	        String status = sc.nextLine();

	        System.out.println("Transaction ID: " + transactionId);
	        switch (status) {
            case "SUCCESS":
                System.out.println("Payment completed");
                break;
            case "PENDING":
                System.out.println("Payment processing");
                break;
            case "FAILED":
                System.out.println("Payment failed");
                break;
            default:
                System.out.println("Unknown status");
        }

        sc.close();
    }

	}

