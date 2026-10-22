package com.kodewala.MethodsInClass;

public class BankAccount {
	 long accountNumber;
	    String accountHolderName;
	    double balance;

	    void displayAccount() {

	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: " + balance);
	    }

	    public static void main(String[] args) {

	        BankAccount a1 = new BankAccount();

	        a1.accountNumber = 10001;
	        a1.accountHolderName = "Rahul";
	        a1.balance = 25000;

	        BankAccount a2 = new BankAccount();

	        a2.accountNumber = 10002;
	        a2.accountHolderName = "Amit";
	        a2.balance = 40000;

	        a1.displayAccount();

	        System.out.println();

	        a2.displayAccount();
	    }
}
