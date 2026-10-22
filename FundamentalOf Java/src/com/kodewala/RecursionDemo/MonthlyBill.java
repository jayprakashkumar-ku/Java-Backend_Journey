package com.kodewala.RecursionDemo;

public class MonthlyBill {
static long calculateBillTotal(long monthlyAmount,int months) {
	if(months<=0) {
		return 0;
	}
	return monthlyAmount+calculateBillTotal(monthlyAmount, months-1);
}
public static void main(String[] args) {
	
	System.out.println(calculateBillTotal(200, 4));
}
}
