package com.kodewala.constructors;

public class BankAccount {
	 String accountNumber;
	    double balance;
	    BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }
	    void display() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	    public static void main(String[] args) {
	        BankAccount account =
	            new BankAccount("ACC101", 50000);

	        account.display();
	    }
}
