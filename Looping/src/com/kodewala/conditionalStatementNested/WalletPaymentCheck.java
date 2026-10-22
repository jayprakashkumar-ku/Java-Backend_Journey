package com.kodewala.conditionalStatementNested;

public class WalletPaymentCheck {
	public static void main(String[] args) {
		
	
final long DAILY_LIMIT_PAISE=1000000L;

long amountPaise = 20000L;
long walletBalancePaise=50000L;
long dailyUsedPaise=900000L;
boolean accountVerification=true;

if(amountPaise <= 0) {
	System.out.println("Invalid Payment amount!");
}else {
	if(accountVerification && walletBalancePaise >= amountPaise) {
		if(dailyUsedPaise <= DAILY_LIMIT_PAISE && amountPaise <= DAILY_LIMIT_PAISE-dailyUsedPaise) {
			System.out.println("Wallet Payment Approved");
			System.out.println("Payment: ₹" + amountPaise / 100.0);
            System.out.println("Remaining Wallet Balance: ₹"
                    + (walletBalancePaise - amountPaise) / 100.0);
            System.out.println("Daily Total After Payment: ₹"
                    + (dailyUsedPaise + amountPaise) / 100.0);
		}
		else {
			System.out.println("Daily payment limit exceeds");
		}
	}else {
		System.out.println("KYC or wallet balance check failed!");
	}
}
}
}