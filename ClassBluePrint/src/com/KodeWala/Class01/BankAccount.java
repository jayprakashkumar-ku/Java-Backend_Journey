package com.KodeWala.Class01;

public class BankAccount {
String accountHolder;
int accountNumber;
double balance;

void deposit() {
	System.out.println("Account deposited!!");
}
void withdraw() {
	System.out.println("Amount withdraw!!");
}
public static void main(String[]args) {
	BankAccount ba=new BankAccount();
	ba.deposit();
	ba.withdraw();
}
}
