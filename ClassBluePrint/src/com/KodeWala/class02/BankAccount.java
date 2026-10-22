package com.KodeWala.class02;

public class BankAccount {
String accountNumber;
double balance;

void deposit(double amount) {
balance = balance+amount;
}
void withdrawl(double amount) {
	
balance=balance-amount;
}
void displayAccountDetails()
{
	 System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
}
}
