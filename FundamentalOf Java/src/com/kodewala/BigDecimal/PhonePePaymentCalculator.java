package com.kodewala.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PhonePePaymentCalculator {
public static void main(String[] args) {
	String amount="1500.00";
	String fees="10.50";
	String cashBackRate="2.5";
	
	BigDecimal _amount=new BigDecimal(amount);
	BigDecimal _fees=new BigDecimal(fees);
	BigDecimal _cashBackRate=new BigDecimal(cashBackRate);
	
	BigDecimal cashBack=_amount.multiply(_cashBackRate).divide(new BigDecimal("100"),2,RoundingMode.HALF_UP);
	BigDecimal total=_amount.add(_fees);
	BigDecimal netCost=total.subtract(cashBack);
	System.out.println(cashBack);
	System.out.println(total);
	System.out.println(netCost);
}
}
