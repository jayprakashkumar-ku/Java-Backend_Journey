package com.KodeWala.Class01;

public class Main0 {
public static void main(String[]args) {
	BankAccount0 account1=new BankAccount0();
	account1.accountHolder = "Rahul";
    account1.accountNumber = 123456;
    account1.balance = 10000;
    
    account1.deposit(2000);
    account1.withdraw(3000);
    account1.displayBalance();
}
}
