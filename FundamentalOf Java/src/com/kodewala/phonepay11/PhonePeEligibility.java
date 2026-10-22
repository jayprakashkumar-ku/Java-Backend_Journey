package com.kodewala.phonepay11;

import java.util.Scanner;

public class PhonePeEligibility {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter amount: ");
    double amount = sc.nextDouble();

    System.out.print("Verified? (true/false): ");
    boolean verified = sc.nextBoolean();
    if (amount <= 0) {
        System.out.println("Invalid amount");
    } 
    else if (!verified) {
        System.out.println("Verification required");
    }
    else {
        System.out.println("Payment eligible");
    }
    sc.close();
}
}
