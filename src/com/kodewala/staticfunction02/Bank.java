package com.kodewala.staticfunction02;

public class Bank {
public static void main(String[] args) {
	
	 BankAccount.displayBankInformation();
	 BankAccount account1 = new BankAccount();
	 
	 account1.accountNumber = "ACC101";
     account1.customerName = "Rahul";
     account1.balance = 50000;
     
     BankAccount account2 = new BankAccount();

     account2.accountNumber = "ACC102";
     account2.customerName = "Priya";
     account2.balance = 75000;
     
     BankAccount account3 = new BankAccount();

     account3.accountNumber = "ACC103";
     account3.customerName = "Amit kumar";
     account3.balance = 23000;
     
     BankAccount account4 = new BankAccount();

     account4.accountNumber = "ACC104";
     account4.customerName = "Priyanka";
     account4.balance = 5000;
     
     account1.displayAccount();

     System.out.println();

     account2.displayAccount();

     System.out.println();
     account3.displayAccount();

     System.out.println();

     account4.displayAccount();

     System.out.println();
     
     BankAccount.displayBankInformation();

}
}
