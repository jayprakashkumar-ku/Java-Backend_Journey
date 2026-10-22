package com.kodewala.Inheritance0;

class BankAccount{
	
	private double balance=5000;
	public double getBalance() {
		System.out.println("Got Balance!");
	return balance;
	}
	
}
class SavingAccount extends BankAccount{
	void displayBalance() {
		System.out.println(getBalance());
	}
}
public class BankDemo {
public static void main(String[] args) {
    SavingAccount account = new SavingAccount();
    account.displayBalance();

}
}
