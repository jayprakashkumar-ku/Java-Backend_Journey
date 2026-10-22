package com.kodewala.Inheritance;

public class PhonePeDemo {
public static void main(String[] args) {
	Customer customer=new Customer();
	customer.userName="Munna Kumar";
	customer.mobileNumber="7461813651";
	
	customer.walletBalance=5000;
	customer.displayUserDetails();
	customer.checkBalance();
}
}
