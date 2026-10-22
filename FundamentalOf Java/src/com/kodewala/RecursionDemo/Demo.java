package com.kodewala.RecursionDemo;

public class Demo {
	
	static void count(int number) {
		if(number==0)
		{
			return;
		}
		System.out.println(number);
		count(number-1);
	}
public static void main(String[] args) {
	count(5);
}
}
