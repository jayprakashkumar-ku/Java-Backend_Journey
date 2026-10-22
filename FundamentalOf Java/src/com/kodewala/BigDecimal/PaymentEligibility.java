package com.kodewala.BigDecimal;

import java.math.BigDecimal;

public class PaymentEligibility {
public static void main(String[] args) {
	 BigDecimal balance = new BigDecimal("500.00");
	 BigDecimal payment = new BigDecimal("499.99");
     if (balance.compareTo(payment) >= 0) {

         // Step 4: Payment deduct karo.
         BigDecimal remaining = balance.subtract(payment);

         System.out.println("Payment Status: Successful");
         System.out.println("Remaining Balance: Rs. " + remaining);
     } else {

         // Step 6: Balance kam ho toh payment reject karo.
         System.out.println("Payment Status: Failed");
         System.out.println("Reason: Insufficient Balance");
     }

}
}
