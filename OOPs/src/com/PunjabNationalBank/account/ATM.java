package com.PunjabNationalBank.account;

public class ATM {
public static void main(String[] args) {
	BankAccount account=new BankAccount("Rahul Kumar", 1500);
	
	System.out.println("Before Updating BankAccount : "+account.getName());
	System.out.println("Before updating BankAccount : ₹"+account.checkBalance());
	
	 account.depositAmount(500);
	System.out.println("Total Balance : ₹"+account.checkBalance());
	
	account.withdrawAmount(1000);
	System.out.println("After Withdrawl Amount : ₹"+account.checkBalance());
	
	account.displayReceipt();
	
}
}
