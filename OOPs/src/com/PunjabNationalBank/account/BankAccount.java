package com.PunjabNationalBank.account;

public class BankAccount {
	private String name;
	private double balance;

	BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public void displayReceipt() {
		System.out.println("-----BankAccount Transaction Receipt----");
		System.out.println("Account User : " + name);
		System.out.println("Total Balance : ₹" + checkBalance());
	}

	public void depositAmount(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount Deposit Successfully! ");
		} else {
			System.out.println("Enter Valid Amount!");
		}
	}

	public void withdrawAmount(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount Withdrawl is Successful!");
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public double checkBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

}
