package com.kodewala.PrivateAccessSpecifier;

public class DigitalWallet {
	private int userId;
    private String userName;
    private double balance;
    
    static String platformName = "PayWallet";
    void createWallet(int id, String name, double initialBalance) {

        userId = id;
        userName = name;
        balance = initialBalance;
    }

    void addMoney(double amount) {

        balance = balance + amount;
    }

    void displayWallet() {

        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
        System.out.println("Balance: " + balance);
    }

    static void displayPlatform() {

        System.out.println("Platform: " + platformName);
    }
}
    

