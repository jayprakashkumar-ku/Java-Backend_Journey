package com.kodewala.phonepay2;

public class PhonePeSummary {
public static void main(String[] args) {
	 // Demo payment details
    int amount = 800;
    int fee = 10;

 // Total payment amount calculate kar rahe hain
    int total = amount + fee;
    
    // User ko payment summary display kar rahe hain
    System.out.println("PhonePe Payment Summary");
    System.out.println("Amount: Rs. " + amount);
    System.out.println("Fee: Rs. " + fee);
    System.out.println("Total: Rs. " + total);
}
}
