package com.kodewala.objects;

public class UserLogic {
String userId;
String userName;
String type;
public static int liveUserCount=0;
public UserLogic(String userId, String userName, String type) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.type = type;
}
public UserLogic( String userName, String type) {
	super();
	this.userName = userName;
	this.type = type;
}
public UserLogic(String userId) {
	super();
	this.userId = userId;
}

{
	
liveUserCount=liveUserCount +1;	
}
}
