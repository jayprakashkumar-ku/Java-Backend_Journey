package com.kodewala.PhonePeMethodDemo;

import java.util.Scanner;

public class PhonePeTransactionSummaryMethod {
	static void displayTransactionSummary(String transactionId, double amount, boolean status) {
		System.out.println("----Transaction Receipt----");
		System.out.println("Transaction ID : " + transactionId);
		System.out.println("Transaction Amount : " + amount);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status;
		for (int i = 1; i <= 2; i++) {
			System.out.println("Transaction ID :");
			String transactionId = sc.nextLine();

			System.out.println("Amount !");
			double amount = sc.nextDouble();

			System.out.println("Enter Status");
			status = sc.nextBoolean();
			sc.nextLine();
			if (amount > 0) {
				if (status) {
					System.out.println("Payment Accepted");
				} else {
					System.out.println("Rejected!!");
				}
			} else {
				System.out.println("Invalid amount!");
			}
			displayTransactionSummary(transactionId, amount, status);

			System.out.println("Payment successfully Completed!!");

		}
		sc.close();

	}

}
