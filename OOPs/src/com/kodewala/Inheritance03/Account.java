package com.kodewala.Inheritance03;

public class Account {
	
	public void openAccount(String userId , String email)
	{
		System.out.println("Account.openAccount()");
	}
	
	class savingAccount extends Account
	{
		@Override //changing the super class methods functionalities
		public void openAccount(String userId,String email)
		{
			System.out.println("SavingAccount.openAccount()");
		}
	}
	class srCitizenAccount extends savingAccount
	{
		@Override
		public void openAccount(String userId,String email)
		{
			System.out.println("SrcCitizenAccount.openAccount()");
		}
	}
	
	class pensionAccount extends srCitizenAccount
	{
		@Override
		public void openAccount(String userId,String email)
		{
			System.out.println("pensionAccount.openAccount()");
		}
	}
	
public static void main(String[] args) {
	
}
}
