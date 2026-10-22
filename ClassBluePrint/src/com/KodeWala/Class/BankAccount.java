package com.KodeWala.Class;

public class BankAccount {
	long accountNumber;
    String accountHolderName;
    double balance;

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();

        a1.accountNumber = 10001;
        a1.accountHolderName = "Rahul";
        a1.balance = 25000;

        BankAccount a2 = new BankAccount();

        a2.accountNumber = 10002;
        a2.accountHolderName = "Amit";
        a2.balance = 40000;

        System.out.println(a1.accountHolderName);
        System.out.println(a1.balance);

        System.out.println(a2.accountHolderName);
        System.out.println(a2.balance);
    }
}
