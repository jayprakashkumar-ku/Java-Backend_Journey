package com.kodewala.MethodsInClass01;
public class Addition {
	
public static int addTwoNumber(String args[]) {
	int num1=Integer.parseInt(args[0]);
	int num2=Integer.parseInt(args[1]);
	int result=num1+num2;
	return result;
}


	public static void main(String[] args) {
		int result1=Addition.addTwoNumber(args);
		System.out.println("Addition is : "+result1);
	}
}
