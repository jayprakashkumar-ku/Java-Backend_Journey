package com.kodewala.phonepay9;

public class PhonePeTransaction {


    public static void main(String[] args) {
        int transactionId = 5001;
        double paymentAmount = 2750.75;
        String transactionStatus = "SUCCESS";
        boolean isPaymentSuccessful = true;

        // Transaction ki details display karna
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs. " + paymentAmount);
        System.out.println("Status: " + transactionStatus);
        System.out.println("Successful: " + isPaymentSuccessful);
    }
}

