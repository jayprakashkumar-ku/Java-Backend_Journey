package com.kodewala.Phone_pe;

public class PhonePeClone01 {
public static void main(String[] args) {
	System.out.println("PhonePe Clone Application Started!");
	PhonePeUser user=new PhonePeUser();
	user.userId="KOD0101";
	user.name="Jay Prakash Kumar!";
	user.mobileNumber="7461813651";
	user.displayDetails();
}
}

class PhonePeUser{
	String userId;
	String name;
	String mobileNumber;
	
	void displayDetails() {
		System.out.println("User ID: "+userId);
		System.out.println("Name : "+name);
		System.out.println("Mobile : "+mobileNumber);
	}
}
