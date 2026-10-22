package com.kodewala.phonepay9;

public class PhonePeReport {
public static void main(String[] args) {
        int paymentAmount = 4500;

        // Automatic widening conversion
        double reportAmount = paymentAmount;

        System.out.println("Original Amount: " + paymentAmount);
        System.out.println("Report Amount: " + reportAmount);
    

}
}
