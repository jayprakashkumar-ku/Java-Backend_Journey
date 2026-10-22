package com.kodewala.BigDecimal;

import java.math.BigDecimal;

public class TransactionReceipt {
public static void main(String[] args) {
	BigDecimal payment=new BigDecimal("2500.75");
	BigDecimal fees=new BigDecimal("12.50");
	
	BigDecimal totalDebit=payment.add(fees);
	System.out.println("Total Debit: " +totalDebit);
}
}
