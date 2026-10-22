package com.kodewala.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CashBackCalculation {
	
	public static void main(String[] args) {
		
	
BigDecimal amount=new BigDecimal("2400");
BigDecimal cashBack=new BigDecimal("3.5");

BigDecimal _cashBack=amount.multiply(cashBack).divide(new BigDecimal("100"),2,RoundingMode.HALF_UP);
BigDecimal _totalpay=amount.subtract(_cashBack);
System.out.println(_cashBack);
System.out.println(_totalpay);

}
}