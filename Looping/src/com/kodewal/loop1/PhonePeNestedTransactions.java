package com.kodewal.loop1;

import java.util.Scanner;

public class PhonePeNestedTransactions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long grandTotal = 0;
		int successfulPayments = 0;
		int rejectedPayments = 0;

		// Outer loop: 2 demo users
		for (int user = 1; user <= 2; user++) {
			long userTotal = 0;
			System.out.println("\nUser " + user);

			// Inner loop: 3 payments for each user
			for (int payment = 1; payment <= 3; payment++) {
				System.out.print("Enter amount for payment " + payment + ": ");
				long amount = sc.nextLong();

				// Validate the amount
				if (amount > 0) {
					userTotal += amount;
					grandTotal += amount;
					successfulPayments++;
				} else {
					System.out.println("Invalid amount rejected.");
					rejectedPayments++;
				}
			}

			// Display the current user's summary
			System.out.println("User total: Rs. " + userTotal);
		}

		// Display overall report
		System.out.println("\n--- Payment Report ---");
		System.out.println("Successful payments: " + successfulPayments);
		System.out.println("Rejected payments: " + rejectedPayments);
		System.out.println("Grand total: Rs. " + grandTotal);

		sc.close();
	}

}
