package com.amazom.user.mgmt;

public class User extends UserMgmt {
public static void main(String[] args) {
	User user=new User();
	
	//User class using the property of parent class(UserMgmt)
	user.doSomething();
	System.out.println(user.type);
	System.out.println(user.location);
}
}
