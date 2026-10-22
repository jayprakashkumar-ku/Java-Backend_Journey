package com.kodewala.phonepay2;

public class phonePePayment {
public static void main(String[] args) {
	 //Payment ki demo amout : 500rupees
	double amount=500.0;
	
	//Filhaal koi additional fee nahi laga rahe
	double fee=0.0;
	
	//Total payable amount calculated kar rahe hain
	double totalAmount = amount +fee;
	
	// Payment summary console par display kar rahe hain
    System.out.println("PhonePe Payment Summary");
    System.out.println("Payment amount: Rs. " + amount);
    System.out.println("Additional fee: Rs. " + fee);
    System.out.println("Total amount: Rs. " + totalAmount);
}
}
