package com.kodewala.Phone_peApp;

public class PhonePeUser {
String userId;
String name;
private long balance;
//String mobileNumber;
 private static String appName = "PhonePe Clone";
 
 void displayBalance() {
	 System.out.println("User : "+name);
	 System.out.println("Balance Rs. "+balance);
 }
 
public void deposit(long amount) {
	 if(amount>0)
	 {
		 balance+=amount;
		 System.out.println("Money Added Successfully!");
		 
	 }
	 else {
		 System.out.println("Invalid Amount!");
	 }
 }

public long getBalance() {
    return balance;
}

// Static method: shared app name return karega.
public static String getAppName() {
    return appName;
}
public void displayBalance(String userName) {
	 System.out.println("App: " + appName);
     System.out.println("User: " + userName);
     System.out.println("Balance: Rs. " + balance);
     System.out.println("----------------------");
} 

//void displayUserDetails() {
//	System.out.println("App Name : "+ appName);
//	System.out.println("User ID : " +userId);
//	System.out.println("Name : "+name);
//	System.out.println("Mobile : "+ mobileNumber);
//
//	System.out.println("---------------------");
//}
}
