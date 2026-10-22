package com.kodewala.staticFunction;

public class Calculator {
	static void add() {

        int a = 10;
        int b = 20;

        System.out.println("Addition: " + (a + b));
    }

    static void multiply() {

        int a = 10;
        int b = 20;

        System.out.println("Multiplication: " + (a * b));
    }

    public static void main(String[] args) {

        Calculator.add();
        Calculator.multiply();
    }
}
