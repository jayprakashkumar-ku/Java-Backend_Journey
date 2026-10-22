package com.kodewala.phonepay9;

public class PhonePeTypeConversion {
public static void main(String[] args) {
	  // Original payment amount integer mein hai
    int paymentAmount = 2500;

    // Widening: int se double
    double reportAmount = paymentAmount;

    // Original decimal amount
    double refundAmount = 799.99;

    // Narrowing: double se int, decimal part remove hoga
    int refundWholePart = (int) refundAmount;

    System.out.println("Payment Amount: " + paymentAmount);
    System.out.println("Report Amount: " + reportAmount);
    System.out.println("Refund Original: " + refundAmount);
    System.out.println("Refund Whole Part: " + refundWholePart);
}
}
