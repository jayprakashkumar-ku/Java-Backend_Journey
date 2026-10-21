package com.kodewala.staticFunction;

public class BankAccount {
long accountNumber;
String accountHolder;
double balance;
static void bankName() {
	System.out.println("Bank: ABC Bank");
	
}
void displayAccount() {
	 System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: " + balance);
}
public static void main(String[] args) {

    BankAccount a1 = new BankAccount();

    a1.accountNumber = 10001;
    a1.accountHolder = "Rahul";
    a1.balance = 25000;

    BankAccount a2 = new BankAccount();

    a2.accountNumber = 10002;
    a2.accountHolder = "Amit";
    a2.balance = 40000;

    BankAccount.bankName();

    a1.displayAccount();

    System.out.println();

    a2.displayAccount();
}
}
