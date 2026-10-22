package com.KodeWala.class02;

public class Driver {
public static void main(String[] args) {
	BankAccount bank=new BankAccount();
	bank.accountNumber="CN0014759B";
	bank.balance=4500;
	bank.deposit(0);
	bank.withdrawl(400);
	bank.displayAccountDetails();
}
}
