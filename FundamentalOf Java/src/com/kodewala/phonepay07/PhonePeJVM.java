package com.kodewala.phonepay07;

public class PhonePeJVM {
public static void main(String[] args) {
	//Payment amount local variable hai
	double amount=1200.00;
	
	//Payment object create kerna
	Payment payment=new Payment(amount);
	
	//class loader ka naam check kerna
	System.out.println("Class Loader :"+PhonePeJVM.class.getClassLoader());
	
	//Payment details display karna
	payment.showPayment();
	
	   // JVM runtime ki memory information
    Runtime runtime = Runtime.getRuntime();

    System.out.println(
        "Approx. Used Memory: " +
        (runtime.totalMemory() - runtime.freeMemory())
        + " bytes");
}
}
