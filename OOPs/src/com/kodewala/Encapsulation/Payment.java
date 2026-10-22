package com.kodewala.Encapsulation;

public class Payment {
private int balance;//Data or variable

public Payment(int balance) {
	super();
	this.balance = balance;
}
//setter
public void doDebit(int _amount)
{
//modifying the data
	balance=balance-_amount;
}
public void doCredit(int _amount)
{
if(_amount>0) {
	//Modifying the data
	balance=balance + _amount;
}	
}
public int getBalance() {
	return balance;
}
}
