package com.kodewal.loop1;

import java.util.Scanner;

public class PhonePePinVerification {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int attempts=0;
	boolean verified = false;
	
	while(attempts<3 && !verified) {
		System.out.println("Enter demo PIN : ");
		int pin=sc.nextInt();
		attempts++;
		
		if(pin ==1234) {
			verified =true;
			System.out.println("Verification successful.");
			
		}
		else {
			System.out.println("Incorrect PIN.");
		}
	}
	if(!verified) {
		System.out.println("Access deneid after 3 attempts.");
	}
	sc.close();
}
}
