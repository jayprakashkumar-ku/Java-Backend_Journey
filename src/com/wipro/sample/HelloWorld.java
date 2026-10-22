package com.wipro.sample;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String args[]) {
		System.out.println("Hello World! from Eclipse IDE....");
		int amount = 200;
		System.out.println("Amount :" + amount);
		HelloWorld.doSomething();
		Scanner sc =new Scanner(System.in);

	}

	public static void doSomething() {
		System.out.println("HelloWorld.doSomething()");
	}

}
