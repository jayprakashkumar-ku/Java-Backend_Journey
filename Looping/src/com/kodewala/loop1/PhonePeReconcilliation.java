package com.kodewala.loop1;

import java.util.Scanner;

public class PhonePeReconcilliation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long totalAmount = 0;
		int rejected = 0;
		for (int user = 1; user <= 3; user++) {
			long userTotal = 0;
			for (int tx = 0; tx <= 2; tx++) {
				System.out.println("User " + user + " ,Transaction " + tx + " :");
				long amount = sc.nextLong();

				if (amount > 0) {
					userTotal += amount;
					totalAmount += amount;
				} else {
					rejected++;

				}
			}
			System.out.println("User total :Rs. " + userTotal);

		}
		System.out.println("Grant Total : Rs. " + totalAmount);
		System.out.println("Rejected transaction : " + rejected);
		
		sc.close();
	}
	
}
