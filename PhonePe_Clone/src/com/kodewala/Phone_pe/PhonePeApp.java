package com.kodewala.Phone_pe;
import java.util.Scanner;
public class PhonePeApp {





    // Existing method: only payment amount
    static long calculateTotal(long amount) {
        return amount;
    }

    // Existing overloaded method: amount + one fee
    static long calculateTotal(long amount, long fee) {
        return amount + fee;
    }

    // NEW: Varargs method — accepts any number of extra charges
    static long calculateFinalPayment(long amount, long... charges) {

        long total = amount;

        // charges is an array, so we can traverse it
        for (long charge : charges) {
            total = total + charge;
        }

        return total;
    }

    // Existing payment validation
    static boolean isValidPayment(long amount, long fee) {
        return amount > 0 && fee >= 0;
    }

    // Existing receipt method
    static void displayReceipt(
            String transactionId, long amount,
            long fee, long total) {

        System.out.println("\n--- PhonePe Clone Receipt ---");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payment Amount: Rs. " + amount);
        System.out.println("Service Fee: Rs. " + fee);
        System.out.println("Total Payable: Rs. " + total);
    }

    // Existing recursion method from Topic 29
    static long calculateInstallmentTotal(
            long installmentAmount, int remainingInstallments) {

        if (remainingInstallments <= 0) {
            return 0;
        }

        return installmentAmount
                + calculateInstallmentTotal(
                    installmentAmount, remainingInstallments - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction ID: ");
        String transactionId = sc.nextLine();

        System.out.print("Enter payment amount: ");
        long amount = sc.nextLong();

        System.out.print("Enter service fee: ");
        long fee = sc.nextLong();

        // Validate payment before calculating the final amount
        if (isValidPayment(amount, fee)) {

            // Varargs receives service fee, convenience fee and tax
            long total = calculateFinalPayment(amount, fee, 5, 2);

            displayReceipt(transactionId, amount, fee, total);

        } else {
            System.out.println("Invalid payment details!");
        }

        // Reusing Topic 29: Recursion
        System.out.print("\nEnter monthly installment amount: ");
        long installmentAmount = sc.nextLong();

        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();

        if (installmentAmount > 0 && installments >= 0) {

            long installmentTotal = calculateInstallmentTotal(
                    installmentAmount, installments);

            System.out.println(
                    "Total installment amount: Rs. " + installmentTotal);

        } else {
            System.out.println("Invalid installment details!");
        }

        sc.close();
    }
}


