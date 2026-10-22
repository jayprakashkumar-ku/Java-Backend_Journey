package com.kodewala.phonepay4;

public class PhonePeCompatibilityReport {
public static void main(String[] args) {
	// Application ka naam display karte hain
    System.out.println("PhonePe-Inspired Backend");

    // Runtime version retrieve karte hain
    String version = System.getProperty("java.version");

    // Runtime version display karte hain
    System.out.println("Running Java Version: " + version);

    // Deployment ke liye compatibility check yaad dilate hain
    System.out.println("Verify library and deployment compatibility");

    // Version print karna compatibility verify karne ke barabar nahi hai
    System.out.println("Runtime detected; compatibility not verified");
}
}
