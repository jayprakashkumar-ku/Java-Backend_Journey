
package com.kodewala.Phone_pe;

import java.util.Scanner;

public class PhonePeCloneApp {

	static long calculateTotal(long amount) {
		return amount;
	}

	static long calculateTotal(long amount, long fees) {
		return amount + fees;
	}

	static boolean isValidPayment(long amount, long fee) {
		return amount > 0 && fee >= 0;
	}

	static void displayReceipt(String transactionId, long amount, long fee, long total) {

		System.out.println("\n--- PhonePe Clone Receipt ---");
		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Payment: Rs. " + amount);
		System.out.println("Fee: Rs. " + fee);
		System.out.println("Total: Rs. " + total);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {

			System.out.println("\nTransaction " + i);

			System.out.print("Enter transaction ID: ");
			String transactionId = sc.nextLine();

			System.out.print("Enter amount: ");
			long amount = sc.nextLong();

			System.out.print("Enter fee: ");
			long fee = sc.nextLong();
			sc.nextLine();

			if (isValidPayment(amount, fee)) {
				long amountWithoutFee = calculateTotal(amount);

				long total = calculateTotal(amount, fee);

				System.out.println("Amount without fees: Rs. " + amountWithoutFee);

				displayReceipt(transactionId, amount, fee, total);

			} else {
				System.out.println("Invalid payment details!");
			}
		}

		sc.close();
	}
}
