package com.kodewala.TypeConversion;

public class MerchantDiscountEngine {
public static void main(String[] args) {
	long purchasePaise=500000L;
	int discountpercent=10;
	long feesPaise=5000L;
	
	long discountPaise=purchasePaise*discountpercent/100;
	
	long payablePaise=(purchasePaise-discountPaise)+feesPaise;
	 System.out.println("Purchase: Rs. " + purchasePaise / 100.0);
     System.out.println("Discount: Rs. " + discountPaise / 100.0);
     System.out.println("Fee: Rs. " + feesPaise / 100.0);
     System.out.println("Final Payable: Rs. " + payablePaise / 100.0);
	
}
}
