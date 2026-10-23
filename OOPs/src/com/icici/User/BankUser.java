package com.icici.User;

import com.icici.account.Bank;

public class BankUser {
	public static void main(String[] args) {
		Bank user1 = new Bank();
		System.out.println("Before Modification : " + user1.getName());
		System.out.println("Before Modification : ₹" + user1.getBalance());

		user1.setName("Rahul Kumar");
		user1.setBalance(750);

		System.out.println("------------------------------");
		System.out.println("After Modification : " + user1.getName());
		System.out.println("After Modification : ₹" + user1.getBalance());
	}

}
