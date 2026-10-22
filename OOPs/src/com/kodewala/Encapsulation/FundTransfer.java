package com.kodewala.Encapsulation;

public class FundTransfer {
private String accountantName;
private String accountNumber;
private double balance;

public FundTransfer(String accountantName, String accountNumber, double balance) {
	super();
	this.accountantName = accountantName;
	this.accountNumber = accountNumber;
	this.balance = balance;
}
public void amount_debit(double amount)
{
	if(amount>0) {
balance=balance-amount;	
	}
}
public void amount_credit(double amount)
{
	if(amount>0) {
balance=balance+amount;	
}
	}
public void setTransaction(double amount)
{
if(amount>0 && amount>=balance) {
	if(amount>0) {
		balance=balance+amount;	
		}
}	
}
public double getBalance()
{
	return balance;
}
}
