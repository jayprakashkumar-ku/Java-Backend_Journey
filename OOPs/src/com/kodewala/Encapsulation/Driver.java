package com.kodewala.Encapsulation;

public class Driver {
	public static void main(String[] args) {
		Payment payment=new Payment(1000);
		payment.doCredit(400);
		payment.doDebit(200);
		
		System.out.println(payment.getBalance());
	}



}
