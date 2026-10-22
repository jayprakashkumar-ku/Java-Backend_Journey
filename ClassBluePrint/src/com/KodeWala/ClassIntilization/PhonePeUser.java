package com.KodeWala.ClassIntilization;

public class PhonePeUser {
 long userId;
 String userName;

public static void main(String[] args) {
	
	PhonePeUser user1=new PhonePeUser();
	user1.userId=101L;
	user1.userName="Jay";
	
	System.out.println("User ID : "+user1.userId);
	System.out.println("User Name : "+user1.userName);
}
}
