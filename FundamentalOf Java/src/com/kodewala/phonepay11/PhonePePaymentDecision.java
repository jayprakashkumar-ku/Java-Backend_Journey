package com.kodewala.phonepay11;

import java.util.Scanner;

public class PhonePePaymentDecision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter transaction ID : ");
		long transactionId = sc.nextLong();

		System.out.print("Is user verified? (true/false): ");
		boolean verified = sc.nextBoolean();

		System.out.println("Enter payment amount : ");
		double amount = sc.nextDouble();

		double serviceFees = 10.0;
		double total = amount + serviceFees;

		System.out.println("\n Transaction ID : " + transactionId);

		if (amount <= 0) {
			System.out.println("Invalid payment amount");

		} else if (!verified) {
			System.out.println("Verification Required!");

		} else if (amount > 100000) {
			System.out.println("Amount exceeds this demo's limit");
		

		} else {
			System.out.println("Total Amount : Rs. " + total);

			String status = "SUCCESS";

			switch (status) {
			case "SUCCESS":
				System.out.println("Payment Completed!!");

				break;

			case "PENDING":
				System.out.println("Payment pending");
				break;

			case "FAILED":
				System.out.println("Payment failed");
				break;

			default:
				System.out.println("Unknown status");

			}
		}
		sc.close();
	}
}
