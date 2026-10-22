package com.kodewala.constructorPractice01;

public class BankApp1 {
	

	    public static void main(String[] args) {

	        // No-argument constructor
	        BankAccount1 account1 = new BankAccount1();

	        // Parameterized constructor
	        BankAccount1 account2 =
	            new BankAccount1(1001, "Rahul", 50000);

	        account1.displayAccount();

	        System.out.println();

	        account2.displayAccount();
}}
