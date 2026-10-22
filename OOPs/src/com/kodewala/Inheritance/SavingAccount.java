package com.kodewala.Inheritance;

public class SavingAccount extends Account {
public void openSavingAccount(String name,String address,String type)
{
//reusing the existing functionalities
	openBankAccount(name, address, type);
}
}
