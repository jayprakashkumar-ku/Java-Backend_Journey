package com.kodewala.phonepay08;

public class phonePePaymentSummary {
public static void main(String[] args) {
	//Payment details
	double amount = 2000.00;
	double fee = 30.00;
	double total=amount+fee;
	
	System.out.println("---------Payment Summary---------");
	System.out.println("Amount : Rs. "+amount);
	System.out.println("Fee: Rs. " + fee);
    System.out.println("Total: Rs. " + total);
    System.out.println("---------------------------");
}
}
