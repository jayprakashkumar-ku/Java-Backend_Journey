package com.kodewala.Phone_pe;

import java.util.Scanner;

public class PhonePeClone {

	static long calculateTotal(long amount) {
		return amount;
	}

	static long calculateTotal(long amount, long fee) {
		return amount + fee;
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

	static long calculateInstallmentTotal(long installmentAmount, int remainingInstallments) {
		if (remainingInstallments <= 0) {
			return 0;
		}
		return installmentAmount + calculateInstallmentTotal(installmentAmount, remainingInstallments - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter transaction ID: ");
		String transactionId = sc.nextLine();

		System.out.print("Enter payment amount: ");
		long amount = sc.nextLong();

		System.out.print("Enter service fee: ");
		long fee = sc.nextLong();
		if (isValidPayment(amount, fee)) {
			long total = calculateTotal(amount, fee);

			displayReceipt(transactionId, amount, fee, total);

		} else {
			System.out.println("Invalid payment details!");
		}
		System.out.print("\nEnter monthly installment amount: ");
		long installmentAmount = sc.nextLong();

		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();

		if (installmentAmount > 0 && installments >= 0) {
			long installmentTotal = calculateInstallmentTotal(installmentAmount, installments);

			System.out.println("Total installment amount: Rs. " + installmentTotal);
		} else {
			System.out.println("Invalid installment details!");
		}

		sc.close();
	}
}
