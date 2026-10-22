package com.kodewala.Phone_peApp;

public class PhonePePayment {
    static long calculateTotal(long amount, long fee) {
        if (amount <= 0 || fee < 0) {
            return -1; // Invalid payment details
        }

        return amount + fee;
    }

    // Static method: payment summary print karega
    static void displayPayment(String transactionId, long total) {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Total payment: Rs. " + total);
    }

}
