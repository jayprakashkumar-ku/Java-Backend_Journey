package com.kodewala.PrivateAccessSpecifier;

public class WalletApp {
	
	    public static void main(String[] args) {

	        DigitalWallet wallet1 = new DigitalWallet();

	        wallet1.createWallet(
	            101,
	            "Amit",
	            2000
	        );

	        DigitalWallet wallet2 = new DigitalWallet();

	        wallet2.createWallet(
	            102,
	            "Sneha",
	            5000
	        );

	        wallet1.addMoney(1000);

	        DigitalWallet.displayPlatform();

	        System.out.println();

	        wallet1.displayWallet();

	        System.out.println();

	        wallet2.displayWallet();
	    }
	}
