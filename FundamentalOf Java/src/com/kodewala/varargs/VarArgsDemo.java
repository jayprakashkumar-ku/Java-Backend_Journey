package com.kodewala.varargs;

public class VarArgsDemo {
	static void displayAmount(int...amount) {
		System.out.println("First amount: "+amount[1]);
	}
public static void main(String[] args) {
	displayAmount(100,0);
	displayAmount(200,100);
	displayAmount(400,0);
}
}
