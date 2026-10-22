package com.kodewala.control.flow;

import java.util.Scanner;

public class PaymentEligibility {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter amount !!");
	double amount =sc.nextDouble();
	
	
	System.out.println("Verification (true /false)");
	boolean verification=sc.nextBoolean();
	
	if(amount<=0)
	{
		System.out.println("Invalid Amount");
	}
	else if(!verification) {
		System.out.println("Verifiaction Required!");
	}
	else {
		System.out.println("Payement eligible!!");
	}
	sc.close();
}

}

