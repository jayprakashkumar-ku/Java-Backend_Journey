package com.icici.account;

public class Bank {
	private String name;
	private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

}
