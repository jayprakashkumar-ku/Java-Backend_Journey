package com.kodewala.objects;

public class User {
String userName;
String userId;
String mobileNumber;
static
{
System.out.println(" I am in static init block");	
}
public User(String userName, String userId, String mobileNumber) {
	super();
	System.out.println("User.user (String userName, String userId, String mobileNumber)...Constructor");
	this.userName = userName;
	this.userId = userId;
	this.mobileNumber = mobileNumber;
	System.out.println(userName+" "+ userId+" "+mobileNumber+" ");
}
}
