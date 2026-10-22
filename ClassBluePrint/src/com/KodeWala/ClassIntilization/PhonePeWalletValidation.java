package com.KodeWala.ClassIntilization;

public class PhonePeWalletValidation {
	long userId;
	String userName;
	long walletBalancePaise;

	public static void main(String[] args) {
		final long MIN_BALANCE_PAISE = 50000L;

		PhonePeWalletValidation user1 = new PhonePeWalletValidation();

		user1.userId = 101L;
		user1.userName = "Jay";
		user1.walletBalancePaise = 75_000L;

		PhonePeWalletValidation user2 = new PhonePeWalletValidation();

		user2.userId = 102L;
		user2.userName = "Rahul";
		user2.walletBalancePaise = 40_000L;
		System.out.println("Checking "+user1.userId+" valid or Not!");
		if(user1.walletBalancePaise >= MIN_BALANCE_PAISE) {
			System.out.println("Valid for Payments!!");
		}else {
			System.out.println("Sorry Not Valid for Payment!");
		}
		
		System.out.println("=====================================");
		System.out.println("Checking "+user2.userId+" valid or Not!");
		if(user2.walletBalancePaise >= MIN_BALANCE_PAISE) {
			System.out.println("You are Valid for Payment!!");
		}else {
			System.out.println("Not Valid!!");
		}

	}

}
