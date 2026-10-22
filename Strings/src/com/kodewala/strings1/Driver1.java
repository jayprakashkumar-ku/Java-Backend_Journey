package com.kodewala.strings1;
class User {
	String name;

	public User(String name) {
		super();
		this.name = name;
	}
	
}
public class Driver1 {
public static void main(String[] args) {
	String city1 ="Bangalore";
	String city2="Bangalore";
	
	System.out.println(city1.equals(city2));
	
	User user1=new User("Kodewala");
	User user2=new User("Kodewala");
	System.out.println(user1.equals(user2));
}
}
