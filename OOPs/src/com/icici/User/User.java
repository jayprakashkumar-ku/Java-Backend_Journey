package com.icici.User;

import com.icici.account.Account;

public class User {
	public static void main(String[] args) {
		Account account = new Account();
		
		//System.out.println(account.balance);
		System.out.println("Before modification ₹:"+ account.getBalance());
		
		account.setBalance(2500);
		
		
		
		//account.balance=200000000;//directly setting or modifying the balance
		
		//System.out.println(account.balance);
		System.out.println("After modification ₹:"+account.getBalance());
		
	}

	
	
}
