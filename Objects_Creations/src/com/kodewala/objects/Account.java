package com.kodewala.objects;

class AccountMgmt{
	public AccountMgmt() {
		System.out.println("AccountMgmt.AccountMgmt()....");
	}
}

public class Account extends AccountMgmt{
String accountNumber;
//Instance Initialization Block-->this will get executed whenever object is created.

{
System.out.println("Account IIB");	
}

public Account(String accountNumber) {
	super();//1st line
	//call to init block-->IIB-->2nd line
	System.out.println("Account(String accountNumber)");
	this.accountNumber = accountNumber;
}

}
