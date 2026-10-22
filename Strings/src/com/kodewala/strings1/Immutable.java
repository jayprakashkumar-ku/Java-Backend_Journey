package com.kodewala.strings1;

public class Immutable {
public static void main(String[] args) {
	String string1="jay";
	string1=string1.concat(" Prakash");
	//String string2="jay Prakash";
	
	String s1="jay";
	s1=s1.concat(" Prakash");
	
	System.out.println(string1==s1);
	//System.out.println(string1==string2);
	
//System.out.println(string1.equals(string2));
	
	//object 
	//string1=string1.concat(" Kumar");
	System.out.println(string1);
	System.out.println(s1);
	
}
}
