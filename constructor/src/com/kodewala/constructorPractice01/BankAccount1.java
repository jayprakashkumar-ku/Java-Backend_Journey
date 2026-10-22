package com.kodewala.constructorPractice01;

public class BankAccount1 {
	private int accountNumber;
    private String customerName;
    private double balance;
    
    private static String bankName="ABC Bank";
    BankAccount1() {
        this.accountNumber = 0;
        this.customerName = "Unknown";
        this.balance = 0;
    }
    BankAccount1(int accountNumber,
            String customerName,
            double balance) {

    this.accountNumber = accountNumber;
    this.customerName = customerName;
    this.balance = balance;
}
    void displayAccount() {

        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}

    

