package com.kodewala.phonepay4;

public class PhonePeRuntimeReport {
public static void main(String[] args) {
	// Payment application ka naam display karte hain
    System.out.println("Payment Application: PhonePe-Inspired");

    //current runtime ka version retrive karte hai
    String version=System.getProperty("java.version");
    System.out.println("Runtime Version : "+version);
    		
}
}
