package com.kodewala.PaymentAmountCalculator;

import java.util.Scanner;

public class NotesCalculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Total count of 10 Rupees Notes!");
	long total_10=sc.nextLong();
	
	System.out.println("Total Count of 20 Rupees Notes!");
	long total_20=sc.nextLong();
	
	System.out.println("Total Count of 50 Rupees Notes!");
	long total_50=sc.nextLong();
	
	System.out.println("Total Count of 100 Rupees Notes!");
	long total_100=sc.nextLong();
	
	System.out.println("Total Count of 200 Ruppes Notes!");
	long total_200=sc.nextLong();
	
	System.out.println("total Count of 500 Rupees Notes!");
	long total_500=sc.nextLong();
	
	long Total_Amount=((10*total_10)+(20*total_20)+(50*total_50)+(100*total_100)+(200*total_200)+(500*total_500));
	
	System.out.println("Total Amount ! : "+Total_Amount);
	
	sc.close();
}
}
