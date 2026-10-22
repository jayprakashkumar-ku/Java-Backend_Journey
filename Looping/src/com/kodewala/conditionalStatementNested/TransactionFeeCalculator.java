package com.kodewala.conditionalStatementNested;

public class TransactionFeeCalculator {
public static void main(String[] args) {
	 final long FIRST_LIMIT_PAISE = 50_000L;  // ₹500
     final long SECOND_LIMIT_PAISE = 200_000L; // ₹2,000

     final long BASIC_FEE_PAISE = 0L;     // ₹0
     final long STANDARD_FEE_PAISE = 500L; // ₹5
     final long HIGH_FEE_PAISE = 1_000L;   // ₹10

     long amountPaise = 150_000L; // ₹1,500
     long feePaise;

     // Pehle invalid amount reject karo
     if (amountPaise <= 0) {
         System.out.println("Invalid transaction amount.");

     } else if (amountPaise <= FIRST_LIMIT_PAISE) {
         feePaise = BASIC_FEE_PAISE;
         System.out.println("Basic transaction fee.");

         System.out.println("Fee: ₹" + feePaise / 100.0);
         System.out.println("Total: ₹" + (amountPaise + feePaise) / 100.0);

     } else if (amountPaise <= SECOND_LIMIT_PAISE) {
         feePaise = STANDARD_FEE_PAISE;
         System.out.println("Standard transaction fee.");

         System.out.println("Fee: ₹" + feePaise / 100.0);
         System.out.println("Total: ₹" + (amountPaise + feePaise) / 100.0);

     } else {
         feePaise = HIGH_FEE_PAISE;
         System.out.println("High-value transaction fee.");

         System.out.println("Fee: ₹" + feePaise / 100.0);
         System.out.println("Total: ₹" + (amountPaise + feePaise) / 100.0);
     }
}
}
