package com.kodewala.phonepay9;

public class PhonePeRefundReport {
public static void main(String[] args) {
	 double refundAmount = 1250.85;

     // Explicit narrowing conversion
     int wholeAmount = (int) refundAmount;

     System.out.println("Refund Amount: " + refundAmount);
     System.out.println("Integer Part: " + wholeAmount);
}
}
