package com.kodewala.BigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
public static void main(String[] args) {
	BigDecimal first=new BigDecimal("0.1");
	BigDecimal second=new BigDecimal("0.2");
	
	BigDecimal result=first.add(second);
	BigDecimal sub=first.subtract(second);
	System.out.println(result);
	System.out.println(sub);
	
	BigDecimal re=new BigDecimal("100.50").multiply(new BigDecimal("2"));
	System.out.println(re);
}
}
