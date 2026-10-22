package com.kodewal.breakContinue;

import java.util.Scanner;

public class PhonePeBreakContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paymentRejected = 0;
		int paymentAccepted = 0;
		long totalAmount = 0;

		for (int user = 1; user <= 5; user++) {
			System.out.println("Enter payment amount(0 to stop): ");
			long amount = sc.nextLong();
			if (amount == 0) {
				System.out.println("Payment Processing Stop!");
				break;
			}
			if (amount < 0) {
				System.out.println("Invalid Amount Skiiping the Transaction:");
				paymentRejected++;
				continue;

			} else {
				System.out.println("Payment Accepted in demo!");
				totalAmount += amount;
				paymentAccepted++;
			}

		}
		System.out.println("\n--- Payment Summary ---");
		System.out.println("Accepted: " + paymentAccepted);
		System.out.println("Rejected: " + paymentRejected);
		System.out.println("Total: Rs. " + totalAmount);

		sc.close();
	}
}
