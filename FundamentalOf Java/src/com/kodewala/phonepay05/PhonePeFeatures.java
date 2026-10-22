package com.kodewala.phonepay05;

public class PhonePeFeatures {
public static void main(String[] args) {
	 // Strong typing: amount ka data type double hai
    double amount = 1000.00;
    
    // Java operators: transaction fee calculate karna
    double fee = amount * 0.02;

    // Total amount calculate karna
    double totalAmount = amount + fee;
    
    // Payment status
    boolean paymentValid = amount > 0;

    // Payment details print karna
    System.out.println("PhonePe Payment Details");
    System.out.println("Amount: Rs. " + amount);
    System.out.println("Fee: Rs. " + fee);
    System.out.println("Total: Rs. " + totalAmount);
    System.out.println("Valid Payment: " + paymentValid);

}
}
