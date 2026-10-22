package com.kodewala.publicSpeciefier01;

public class BankAccount {
	 public int accountNumber;
	    public String customerName;
	    private double balance;
	    
	    public static String bankName="ABC Bank";
	    
		public BankAccount(int accountNumber, String customerName, double balance) {
	    	
	    	this.accountNumber=accountNumber;
	    	this.customerName=customerName;
	    	this.balance=balance;
	    }
	    public void deposit(double amount)
	    {
	    	balance=balance+amount;
	    }
	    public void displayAccount()
	    {
	    	 System.out.println("Account Number: "
                     + accountNumber);

  System.out.println("Customer Name: "
                     + customerName);

  System.out.println("Balance: "
                     + balance);
	    }
	    public static void displayBank() {
	    	System.out.println("Bank : "+bankName);
	    }
}
