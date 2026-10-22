package com.kodewala.strings1;

public class Driver {
public static void main(String[] args) {
	
	//create a String Object
	
	String firstName = "Kodewala";
	String lastName = "kodewala";
	
	String str1 = new String("Java");
	String str2 = new String("Java");

	System.out.println(str1 == str2);       // false
	System.out.println(str1.equals(str2));  // true
	System.out.println("======================================");
	/*
	 * Object created in SCP -->firstName's address-->xyz321
	 * Object with content "Kodewala" already created
	 * and lastName will refer to existing object.
	 * lastName is also pointing to address xyz321
	 */
	//String city = new String("Bangalore"); 
	
	System.out.println(firstName==lastName);
	System.out.println(firstName.equals(lastName));
	// == will compare the address of an object
}
}
