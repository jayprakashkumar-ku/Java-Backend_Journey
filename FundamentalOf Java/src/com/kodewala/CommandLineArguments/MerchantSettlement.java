package com.kodewala.CommandLineArguments;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MerchantSettlement {
public static void main(String[] args) {
	long grossAmountPaise=5000000L;
	BigDecimal feeRate=new BigDecimal("2");
	
	if(grossAmountPaise < 0) {
		System.out.println("Invalid Gross Amount!");
		return;
	}
	BigDecimal grossRupees=BigDecimal.valueOf(grossAmountPaise,2);
	BigDecimal feesRupees=grossRupees.multiply(feeRate).divide(new BigDecimal("100"), 2,RoundingMode.HALF_UP);
	
	long feePaise = feesRupees
            .movePointRight(2)
            .longValueExact();

    // Net settlement = gross amount - fee
    long netSettlementPaise =
            Math.subtractExact(grossAmountPaise, feePaise);

    // Final receipt display
    System.out.printf("Gross Amount: Rs. %.2f%n", grossRupees);
    System.out.printf("Platform Fee: Rs. %.2f%n", feesRupees);
    System.out.printf("Net Settlement: Rs. %.2f%n",
            BigDecimal.valueOf(netSettlementPaise, 2));

}
}
