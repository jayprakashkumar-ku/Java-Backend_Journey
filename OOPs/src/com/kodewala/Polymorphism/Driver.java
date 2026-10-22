package com.kodewala.Polymorphism;
class User{
	
	
}
class AdminUser extends User{
	
	
}
class FinanceUser extends AdminUser
{
	
}

public class Driver {
public static void main(String[] args) {
	User u1=new User();//user class is reffering user class object
	AdminUser au1=new AdminUser();
	
	User au2=new AdminUser();//Parent class can refer child class Object-->auto up-casting
	
	Object au3=new FinanceUser();
	
	AdminUser au=(AdminUser)new User();//child class is reffering parent class object-->down casting
	}
}
