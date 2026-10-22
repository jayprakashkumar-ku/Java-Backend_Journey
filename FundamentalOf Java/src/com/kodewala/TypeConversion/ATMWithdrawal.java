package com.kodewala.TypeConversion;

public class ATMWithdrawal {
public static void main(String[] args) {
	long balancePaise=800000L;
	long withdrawalpaise=100000L;
	long feePaise=2000;
	
	long totalDeduction=Math.addExact(withdrawalpaise, feePaise);
	
	if(withdrawalpaise>0 && balancePaise >= totalDeduction) {
		long remainingBalance=balancePaise-totalDeduction;
		System.out.println("Withdrwal Succeaaful");
		System.out.println("Remaining Balance: Rs. "+remainingBalance/100);
	}
	else
	{
		System.out.println("Withdrawal Rejected!");
	}
	
	
}
}
