package com.kodewala.strings1;

public class BasicString {
	public static void main(String[] args) {
		// String is a class.it can be created Objects by Two ways
		/*
		 * 1.By Using Literals 2.by using new KeyWord
		 * 
		 * Java checks if any Objects with content("Bangalore")exists In String Constant
		 * pool (SCP),if exists then no object created and it starts refering the
		 * existing onject , if not then it create new object with content "Bangalore"
		 * 
		 */
		String city = "Banga" + "lore";// "Banga"+"lore" --> Compile time(SCP)
										// city+"BTM" -->Runtime(HEAP)
		//String city1 = city + " BTM";// firstName+lastName -->Runtime(HEAP)
		String country = "India";// "jay"+"Prakash" -->compile time(SCP)
		String c = "Bangalore";
		System.out.println(city== c);// true
	}
}
