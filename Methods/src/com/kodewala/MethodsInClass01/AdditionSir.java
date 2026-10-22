package com.kodewala.MethodsInClass01;

public class AdditionSir {
	
	static int AddTwoNumbers(int number1,int number2) {
		System.out.println("START main() :");
		int addition=number1+number2;
		System.out.println("END AddTwoNumbers");
		return addition;
		
	}
public static void main(String[] args) {
	int value1=Integer.parseInt(args[0]);
	int value2=Integer.parseInt(args[1]);
	int result=AdditionSir.AddTwoNumbers(value1, value2);
	System.out.println("ADdition Is :"+result);
}
}
