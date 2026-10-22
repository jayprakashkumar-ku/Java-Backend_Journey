package com.KodeWala.ClassIntilization;

public class PhonePayUser {
	long userId;
	String userName;
	long walletBalancePaise;
public static void main(String[] args) {
	PhonePayUser user1=new PhonePayUser();
	user1.userId=101L;
	user1.userName="Munna";
	user1.walletBalancePaise=50000L;
	
	PhonePayUser user2=new PhonePayUser();
	user2.userId=102L;
	user2.userName="Prakash";
	user2.walletBalancePaise=5000L;
	
	System.out.println("User ID : "+user1.userId);
	System.out.println("User Name : "+user1.userName);
	System.out.println("Wallet Balance : "+user1.walletBalancePaise/100.0);
	
	System.out.println("================================");
	
	System.out.println("User ID : "+user2.userId);
	System.out.println("User Name : "+user2.userName);
	System.out.println("Wallet Balance : "+user2.walletBalancePaise/100.0);
}
}
