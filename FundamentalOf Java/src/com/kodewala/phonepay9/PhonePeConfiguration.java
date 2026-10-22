package com.kodewala.phonepay9;

public class PhonePeConfiguration {

    public static void main(String[] args) {
        final double MAX_PAYMENT_LIMIT = 100000.0;
        String paymentReference = "PHN10025";
        String optionalReference = null;

        // Configuration display karna
        System.out.println("Maximum Limit: Rs. " + MAX_PAYMENT_LIMIT);
        System.out.println("Reference: " + paymentReference);
        System.out.println("Optional Reference: " + optionalReference);
    }
}


