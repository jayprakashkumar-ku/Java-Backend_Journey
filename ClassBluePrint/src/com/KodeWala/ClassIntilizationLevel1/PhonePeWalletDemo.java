package com.KodeWala.ClassIntilizationLevel1;

public class PhonePeWalletDemo {
	String userName;
	long balancePaise;
	boolean accountVerification = true;

	PhonePeWalletDemo(String userName, long balancePaise) {
		this.userName = userName;
		this.balancePaise = balancePaise;
	}

	void makePayment(long amountPaise, String paymentMode) {
		long feePaise = 0L;
		long totalDebitPaise;

		switch (paymentMode) {
		case "UPI":
			feePaise = 0L;
			break;

		case "BANK":
			feePaise = 150;
			break;

		case "CARD":
			feePaise = 150L;
			break;

		default:
			System.out.println("Invalid payment mode!");
			return;
		}
		totalDebitPaise = amountPaise + feePaise;

		System.out.println("\nUser: " + userName);
		System.out.println("Payment mode: " + paymentMode);
		System.out.println("Payment: ₹" + amountPaise / 100.0);
		System.out.println("Fee: ₹" + feePaise / 100.0);

		if (amountPaise <= 0) {
			System.out.println("Amount must be in positive!");
		} else {
			if (accountVerification) {
				System.out.println("Account Verified!");

				if (totalDebitPaise <= balancePaise) {
					balancePaise -= totalDebitPaise;
					System.out.println("Payment successfully Completed!");
				} else {
					System.out.println("Insufficient Balance!");
				}
			} else {
				System.out.println("account Not Verified Please Enter Valid Details!");
			}
		}

		System.out.println("Remaining Balance : " + balancePaise / 100.0);
	}

	public static void main(String[] args) {

		PhonePeWalletDemo user1 = new PhonePeWalletDemo("Rahul", 50_000L);

		PhonePeWalletDemo user2 = new PhonePeWalletDemo("Amit", 20_000L);
		long[] amounts = { 10_000L, 25_000L, 30_000L };
		String[] modes = { "UPI", "BANK", "CARD" };

		for (int i = 0; i < amounts.length; i++) {
			user1.makePayment(amounts[i], modes[i]);
		}
		System.out.println("\n--- Final Wallet Balances ---");
		System.out.println("Rahul: ₹" + user1.balancePaise / 100.0);
		System.out.println("Amit: ₹" + user2.balancePaise / 100.0);
	}

}
