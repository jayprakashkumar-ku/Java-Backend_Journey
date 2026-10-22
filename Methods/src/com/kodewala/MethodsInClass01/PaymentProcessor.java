package com.kodewala.MethodsInClass01;

public class PaymentProcessor {

    public static void main(String[] args) {

        PaymentProcessor.transFund("4785001450", "0012587954");

    }

    public static boolean transFund(String senderAccoNum, String receiverAccouNum) {

        boolean resStatus =
                PaymentProcessor.checkReceiverDetails(receiverAccouNum);

        boolean sendStatus =
                PaymentProcessor.checkSenderDetails(senderAccoNum);

        int balance =
                PaymentProcessor.checkSenderBalance(senderAccoNum);

        System.out.println("Sender Balance: " + balance);

        return true;
    }

    public static boolean checkSenderDetails(String senderAccoNum) {

        System.out.println("Checking Sender Details!");
        System.out.println("Sender Account: " + senderAccoNum);

        return true;
    }

    public static boolean checkReceiverDetails(String receiverAccouNum) {

        System.out.println("Checking Receiver Details!");
        System.out.println("Receiver Account: " + receiverAccouNum);

        return true;
    }

    public static int checkSenderBalance(String senderAccoNum) {

        System.out.println("Checking Sender Balance!");
        System.out.println("Sender Account: " + senderAccoNum);

        return 1000;
    }
}