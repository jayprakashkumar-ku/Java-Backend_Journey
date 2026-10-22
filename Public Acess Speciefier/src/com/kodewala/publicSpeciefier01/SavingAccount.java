package com.kodewala.publicSpeciefier01;

public class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount(int accountNumber, String customerName, double balance, double interestRate) {
		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}

	public void displaySavingsAccount() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name: " + customerName);

		System.out.println("Interest Rate: " + interestRate);

	}
}
