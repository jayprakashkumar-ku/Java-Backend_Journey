package com.kodewala.BankAccount;

public class BankSystem {
	 public static void main(String[] args) {

	        Manager m1 = new Manager(
	            101,
	            "Rahul",
	            60000,
	            "Loans"
	        );

	        Manager m2 = new Manager(
	            102,
	            "Amit",
	            70000,
	            "Accounts"
	        );

	        m1.displayManager();
	        m2.displayManager();

	        BankEmployee.displayBank();
	    }
}
