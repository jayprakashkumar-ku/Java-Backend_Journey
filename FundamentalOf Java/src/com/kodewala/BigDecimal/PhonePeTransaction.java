package com.kodewala.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PhonePeTransaction {
public static void main(String[] args) {
	BigDecimal paymentAmount=new BigDecimal("3500.50");
	BigDecimal fees=new BigDecimal("15.25");
	BigDecimal cashBack=new BigDecimal("2");
	
	BigDecimal cash_Back=paymentAmount.multiply(cashBack).divide(new BigDecimal("100"),2,RoundingMode.HALF_UP);
	
	BigDecimal totalDebit=paymentAmount.subtract(cash_Back).add(fees);
	System.out.println(totalDebit);
	System.out.println(cash_Back);
}
}
