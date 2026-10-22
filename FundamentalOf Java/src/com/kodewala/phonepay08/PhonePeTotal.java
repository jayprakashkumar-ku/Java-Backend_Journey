package com.kodewala.phonepay08;

public class PhonePeTotal {
	public static void main(String[] args) {
        double amount = 4000.00;
        double serviceFee = 20.00;

        // Amount aur fee ko add karna
        double total = amount + serviceFee;

        System.out.println("Payment Amount: Rs. " + amount);
        System.out.println("Service Fee: Rs. " + serviceFee);
        System.out.println("Total: Rs. " + total);
    }

}
