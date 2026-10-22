package com.kodewala.TypeConversion;

public class TransactionCounter {
public static void main(String[] args) {
	int intCounter = Integer.MAX_VALUE;
	intCounter++;
	
	System.out.println("Int counter : "+intCounter);
	
	long longCounter=(long)Integer.MAX_VALUE;
	longCounter++;
	
	System.out.println("Long Counter: "+longCounter);
	//overflow detect karnae ka safer approach.
	
	try {
		 long safeCounter = Long.MAX_VALUE;
         safeCounter = Math.incrementExact(safeCounter);
         System.out.println(safeCounter);
         
	  } catch (ArithmeticException e) {
          System.out.println("Counter overflow detected");
	}
}
}
