package com.kodewala.PaymentAmountCalculator;

import java.util.Scanner;

public class PaymentAccountCalculator {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in) ;
	
	System.out.println("Enter Payment Amount in Rupees:");
	long amountRupees=sc.nextLong();
	
	long amountPaisa = amountRupees*100;
	System.out.println("Payment Amount : Rs."+amountRupees);
	System.out.println("Payment Amount in Paisa :"+amountPaisa);
sc.close();
}

}
