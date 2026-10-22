package com.kodewala.objects;

public class UserCookies {
private String userName;
private String userId;

private String mobile;
private String email;

public UserCookies(String userId) {
	this("Guest User", userId,"7461813651","abc@gmail.com");
	System.out.println("User.User()-1");
}



public UserCookies(String userName, String userId, String mobile, String email) {
	super();
	System.out.println("User.user()-2");
	this.userName = userName;
	this.userId = userId;
	this.mobile = mobile;
	this.email = email;
}

}
