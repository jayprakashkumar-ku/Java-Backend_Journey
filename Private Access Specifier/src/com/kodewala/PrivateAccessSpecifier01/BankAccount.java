package com.kodewala.PrivateAccessSpecifier01;

public class BankAccount {
	private int accountNumber;
    private String customerName;
    private double balance;
private static String bankName="ABC Bank";
void createAccount(int number, String name, double amount) {
	accountNumber=number;
	customerName=name;
	balance=amount;
}
void deposit(double amount) {
	if(amount>0) {
		balance=balance+amount;
	}
}
void withdraw(double amount) {
	if(amount>0 &&amount<=balance) {
		balance=balance-amount;
		System.out.println("Withdrawl Successful");
	}else {
		System.out.println("insufficient Balance");
	}
}
void displayAccount() {

    System.out.println("Account Number: " + accountNumber);
    System.out.println("Customer: " + customerName);
    System.out.println("Balance: " + balance);
}

static void displayBankName() {

    System.out.println("Bank: " + bankName);
}

}
