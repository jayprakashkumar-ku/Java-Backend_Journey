package com.kodewala.phonepay10;

import java.util.Scanner;

public class PhonePeReferance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Transaction count: ");
	int count =sc.nextInt();
	
	//nextInt ke baad new line consume kerna
	sc.nextLine();
	
	System.out.print("Transaction reference: ");
    String reference = sc.nextLine();

    // Previous topic: widening conversion
    double reportCount = count;

    System.out.println("Count: " + count);
    System.out.println("Report Count: " + reportCount);
    System.out.println("Reference: " + reference);

}
}
