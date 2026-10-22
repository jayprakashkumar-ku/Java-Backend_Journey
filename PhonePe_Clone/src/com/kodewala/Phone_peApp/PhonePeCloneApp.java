package com.kodewala.Phone_peApp;

public class PhonePeCloneApp {
public static void main(String[] args) {
	PhonePeUser user1 = new PhonePeUser();
	user1.userId = "U101";
    user1.name = "Rahul";
    //user1.mobileNumber = "9876543210";
    user1.balance=1000;
    
    PhonePeUser user2 = new PhonePeUser();
    user2.userId = "U102";
    user2.name = "Priya";
   // user2.mobileNumber = "9876501234";
    user2.balance=2000;

    //System.out.println("Common App: " + PhonePeUser.appName);

    //System.out.println("\n--- User 1 ---");
    
    //user1.displayUserDetails();
    user1.displayBalance();
    user1.deposit(1500);
    
    //System.out.println("--- User 2 ---");
    //user2.displayUserDetails();
    user2.displayBalance();
    user2.deposit(-200);
    
    long total=PhonePePayment.calculateTotal(500, 10);
    if(total!=-1) {
    	PhonePePayment.displayPayment("TXN101", total);
    }
    
    // Static variable update karne par shared value change hoti hai
   // PhonePeUser.appName = "PhonePe Learning App";
    
//    System.out.println("After updating static variable:");
//
//   user1.displayUserDetails();
 //  user2.displayUserDetails();
    
 // Static members ko class name se access karte hain
//    PhonePeAppConfig.displayAppInfo();
//
//    System.out.println("\nUpdating app version...");
//
//    PhonePeAppConfig.updateVersion(2);
//
//    // Same class ke shared static data ki updated value
//    PhonePeAppConfig.displayAppInfo();
}
}
