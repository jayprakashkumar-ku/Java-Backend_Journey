package com.kodewal.breakContinue;

import java.util.Scanner;

public class PhonePeValidPaymentTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long total = 0;
		int validCount = 0;
		int invalid = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter Amount !" + i + " :  ");
			long amount = sc.nextLong();

			if (amount < 0) {
				System.out.println("Negative amount!");
				invalid++;
				continue;
			}
			if (amount == 0) {
				System.out.println("not Valid!!");
				invalid++;
			} else {
				total += amount;
				validCount++;

			}

		}
		System.out.println("Valid Payments:" + validCount);
		System.out.println("Invalid payments :" + invalid);
		System.out.println("Total Amount!" + total);

		sc.close();
	}
}