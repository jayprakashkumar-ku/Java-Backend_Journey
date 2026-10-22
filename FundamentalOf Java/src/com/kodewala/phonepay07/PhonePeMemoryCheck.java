package com.kodewala.phonepay07;

public class PhonePeMemoryCheck {
	static class Payment{
		double amount;
		Payment (double _amount){
			this.amount=_amount;
		}
	}
public static void main(String[] args) {
	//Heap main Payment object create hota hai
	Payment payment=new Payment(2500.00);
	
	//Current JVM runtime access karna
	Runtime runtime=Runtime.getRuntime();
	long usedMemory=runtime.totalMemory()-runtime.freeMemory();
	System.out.println("Payment : Rs. "+payment.amount);
	System.out.println("Approx.Used Memory : "+usedMemory+" bytes");
}
}
