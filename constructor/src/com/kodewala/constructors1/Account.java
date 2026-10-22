package com.kodewala.constructors1;

public class Account 
{
int amount;
String name;
 
//If developer is not providing any constructor in a class then compilor will add default
//constructor(no args constructor)

Account() 
{
System.out.println("Inside Account()!!"); 
}

Account(int _amount ,String _name){
	System.out.println("Inside Account (int _amount ,String _name)");
	this.amount=_amount;
	this.name=_name;

}

}
