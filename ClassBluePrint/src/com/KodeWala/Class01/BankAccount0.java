package com.KodeWala.Class01;

public class BankAccount0 {
	String accountHolder;
    long accountNumber;
    double balance;
    
    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposit successful");
    }
    void withdraw(double amount) {

        balance = balance - amount;

        System.out.println("Withdrawal successful");
    }
    void displayBalance() {

        System.out.println("Balance: " + balance);
    }

}
