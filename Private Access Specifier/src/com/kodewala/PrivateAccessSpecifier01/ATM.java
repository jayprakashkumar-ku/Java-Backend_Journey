package com.kodewala.PrivateAccessSpecifier01;

public class ATM {
	 public static void main(String[] args) {

		 BankAccount account1 = new BankAccount();

	        account1.createAccount(
	            101,
	            "Rahul",
	            50000
	        );

	        BankAccount account2 = new BankAccount();

	        account2.createAccount(
	            102,
	            "Priya",
	            30000
	        );
	        BankAccount.displayBankName();

	        System.out.println();

	        account1.deposit(5000);
	        account1.withdraw(60000);

	        account1.displayAccount();

	        System.out.println();

	        account2.displayAccount();
}
}