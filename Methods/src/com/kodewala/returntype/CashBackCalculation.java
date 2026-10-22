
package com.kodewala.returntype;

import java.util.Scanner;

public class CashBackCalculation {

	static long cashBackCalculation( long payment) {
		long cashBack = (long) (payment * 0.05);
		return cashBack;
	}

	static void displayTransactionDetails(String transactionId, long payment, long cashBack) {

		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Payment Amount: " + payment);
		System.out.println("Cashback Amount: " + cashBack);
		System.out.println("------------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {

			System.out.println("Enter the Transaction ID:");
			String transactionId = sc.nextLine();

			System.out.println("Enter Payment Amount:");
			long payment = sc.nextLong();
			sc.nextLine();

			if (payment > 100) {
				long cashback = cashBackCalculation( payment);

				displayTransactionDetails(transactionId, payment, cashback);
			} else {
				System.out.println("Cashback is not applicable. Payment must exceed 100.");
			}
		}

		sc.close();
	}
}
