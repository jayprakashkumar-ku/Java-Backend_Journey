package com.kodewala.Inheritance;

public class Customer extends User{
	double walletBalance;
	
	void checkBalance() {
		System.out.println("Wallet Balance : ₹ "+walletBalance);
	}

}
