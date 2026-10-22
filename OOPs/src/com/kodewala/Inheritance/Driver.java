package com.kodewala.Inheritance;

public class Driver{
public static void main(String[] args) {
	System.out.println("main() START");
	SavingAccount account=new SavingAccount();
	account.openSavingAccount("Kodewala", "Bangalore BTM", "Saving");
	
	System.out.println("End main()!");
}
}
