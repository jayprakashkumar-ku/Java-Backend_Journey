package com.kodewala.Encapsulation;

public class Driver02 {
public static void main(String[] args) {
	FundTransfer fundtransfer=new FundTransfer("Rahul Kumar", "650001000004857", 5400);
	fundtransfer.amount_credit(4500);
	
	System.out.println(fundtransfer.setTransaction(100));
}
}
