package com.kodewala.constructorPractice01;

class BankApp {
	int accountNumber;              // default access
    private double balance;         // private access
    public BankApp(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {

        BankApp account =
            new BankApp(1001, 50000);

        account.deposit(5000);
        account.displayAccount();

        System.out.println(account.accountNumber);
        // System.out.println(account.balance); // Error
    }
}
