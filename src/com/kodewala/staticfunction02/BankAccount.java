package com.kodewala.staticfunction02;

public class BankAccount {
String accountNumber;
String customerName;
double balance;

static String bankName= "Punjab National Bank";
static int totalAccounts=0;

BankAccount(){
	totalAccounts++;
}
void displayAccount()
{
System.out.println("Account Number : "+accountNumber);
System.out.println("Customer name : "+customerName);
System.out.println("Balance : "+balance);
}
static void displayBankInformation() {

    System.out.println("Bank Name: " + bankName);
    System.out.println("Total Accounts: " + totalAccounts);
}
}
