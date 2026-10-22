package com.kodewala.conditionalStatementNested;

public class PhonePeTransactionReceipt {
	public static void main(String[] args) {
		final long MIN_PAYMENT_PAISE = 100L;
		final long BASIC_LIMIT_PAISE = 500L;
		final long STANDARD_LIMIT_PAISE = 200000L;

		final long BASIC_FEE_PAISE = 0L; // ₹0
		final long STANDARD_FEE_PAISE = 500L; // ₹5
		final long HIGH_FEE_PAISE = 1_000L;

		long amountPaise = 150_000L; // ₹1,500
		int paymentMethod = 1; // 1 = UPI
		boolean accountVerified = true;

		long feePaise = 0L;
		String paymentMethodName = "Invalid";
		boolean validMethod = true;
		switch (paymentMethod) {
		case 1:
			paymentMethodName = "UPI";
			break;
		case 2:
			paymentMethodName = "wallet";
			break;
		case 3:
			paymentMethodName = "Bank Transfer";
			break;

		default:
			validMethod = false;
			break;
		}
		if (accountVerified) {

			if (amountPaise >= MIN_PAYMENT_PAISE && validMethod) {
				if (amountPaise >= MIN_PAYMENT_PAISE && validMethod) {
					if (amountPaise <= BASIC_LIMIT_PAISE) {
						feePaise = BASIC_FEE_PAISE;
					} else if (amountPaise <= STANDARD_LIMIT_PAISE) {
						feePaise = STANDARD_FEE_PAISE;
					} else {
						feePaise = HIGH_FEE_PAISE;

					}
					// Step 5: Payment receipt display karo
					System.out.println("----- PhonePe Payment Receipt -----");
					System.out.println("Payment Status: Successful");
					System.out.println("Payment Method: " + paymentMethodName);
					System.out.println("Payment Amount: ₹" + amountPaise / 100.0);
					System.out.println("Transaction Fee: ₹" + feePaise / 100.0);
					System.out.println("Total Amount: ₹" + (amountPaise + feePaise) / 100.0);
					System.out.println("-----------------------------------");

				} else {
					System.out.println("Payment failed: Invalid amount or method.");
				}

			} else {
				System.out.println("Payment failed: KYC verification required.");
			}

		}
	}
}