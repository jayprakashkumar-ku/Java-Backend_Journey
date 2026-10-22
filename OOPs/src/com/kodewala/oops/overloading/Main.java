
	package com.kodewala.oops.overloading;

	class Payment {
	void processPayment(int amount) {
		System.out.println("Processing payment of $"+amount);
	}

	void processPayment(String upiID,int amount)
	{
	System.out.println("Processing UPI payment of $"+amount+" from UPI ID: "+upiID);	

	}

	void processPayment(boolean confirmation,int amount)
	{
	System.out.println("Processing UPI payment of $"+amount+" with confirmation : "+confirmation);	

	}
	}

	public class Main{
		public static void main(String[] args) {
			Payment payment=new Payment();
			payment.processPayment(500);
			payment.processPayment("prakash@upi",540);
			payment.processPayment(true, 2000);
		}
	}


