package com.icici.account;

public class Account {
	
private int balance;

//Public method
public int getBalance() 
{
	return balance;
}
public void setBalance(int balance) 
{
	if(balance > 0) // allowing modification in controlled way
	{
this.balance=balance;
	}
}

}
