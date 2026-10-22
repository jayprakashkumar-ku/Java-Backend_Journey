package com.kodewala.strings2;

public class Driver {
public static void main(String[] args) {
	/*
	 * Immutable --> Once String object is created ,you cannot change the object.if
	 * you try to change then in result you will get new object.
	 */
	String s1 = "kodewala"; //SCP -->123qwe
	String s2=new String("Academy");
	
	//System.out.println(s1==s2);
	
	String s3=new String("Kodewala");
	String s4=new String("Kodewala");
	
	System.out.println(s4==s3);
	System.out.println(s4.equals(s3));
}
}
