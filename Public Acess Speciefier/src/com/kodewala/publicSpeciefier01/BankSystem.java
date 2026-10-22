package com.kodewala.publicSpeciefier01;

public class BankSystem {
	public static void main(String[] args) {
		SavingAccount account1 = new SavingAccount(1001, "Rahul", 50000, 7.5);
		SavingAccount account2 = new SavingAccount(1002, "Amit", 75000, 8.0);
		account1.displayAccount();
		account1.displaySavingsAccount();

		System.out.println();

		account2.displayAccount();
		account2.displaySavingsAccount();

		BankAccount.displayBank();
	}
}
