package com.kodewala.constructors;

public class SBIUser
{
private String name;
private String userId;
private String pwd;
private double balance;

public SBIUser()
{
System.out.println("inside the Constructor!!");
}
public SBIUser(String name, String userId, String pwd, double balance) 
{
	super();
	System.out.println("SBIUser.user(String name, String userId, String pwd, double balance)...");
	this.name = name;
	this.userId = userId;
	this.pwd = pwd;
	this.balance = balance;
}
public static void main(String[] args)
{
	System.out.println("SBIUser get START main() ");
	SBIUser user1=new SBIUser();
	SBIUser user2=new SBIUser("Munna Kumar","XYZ123","munna123@",25879);
	System.out.println("END of the main method() ");
}
}
