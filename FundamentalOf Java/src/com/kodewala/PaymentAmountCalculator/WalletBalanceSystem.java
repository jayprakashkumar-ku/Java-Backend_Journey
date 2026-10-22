package com.kodewala.PaymentAmountCalculator;

public class WalletBalanceSystem {
	public static void main(String[] args) {

		long walletBalancePaisa = 1000000L;
		long dailyLimitPaise = 2500000L;
		long minimumBalancePaise = 10000;
		int transactionCount = 5;
		boolean walletActive = true;
		String customerName = "Rahul";
		System.out.println("Customer: " + customerName);
		System.out.println("Wallet Balance : Rs. " + walletBalancePaisa / 100.0);
		System.out.println("Daily Limit: Rs. " + dailyLimitPaise / 100.0);
		System.out.println("Minimum Balance: Rs. " + minimumBalancePaise / 100.0);

		 System.out.println("Transaction Count: " + transactionCount);
	        System.out.println("Wallet Active: " + walletActive);
	    
	}
}
