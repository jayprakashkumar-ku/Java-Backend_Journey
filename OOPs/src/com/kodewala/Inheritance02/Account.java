package com.kodewala.Inheritance02;

public class Account {
	int minBalance=10000;
public String openAccount(String name,int initBal) {
	
	System.out.println("Account.openAccount()....");
	return"some String";
}
}

class savingAccount extends Account
{
	//1.		Method name should be same.
	//2.		Type order and Number of args should be same
	//3.		Return type should be same except covariant
	//4.		Access modifier-->should be same or widen(public-->public,
	//		protected -->protected or public)
	//5.    you are telling compiler that - i am overriding the methods.please check all the rules.
	
	@Override
public String openAccount(String _name,int initBal)
{
		//200 lines of the code--> x+1
System.out.println("savingAccount.openAccount()......");	
return "some other String";
}
}
