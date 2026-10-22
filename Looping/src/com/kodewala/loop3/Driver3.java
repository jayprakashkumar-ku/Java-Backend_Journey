package com.kodewala.loop3;

public class Driver3 {
	public static void main(String[] args) {
		int[] numbers = { 45, -23, 78, -91, 12, -56, 34, -84, -82, 68, -24, 35, -93, 80, -7, 14, -59, 52, -41, 91, 28 };
		for(int index=0; index<numbers.length; index++) 
		{
			int currentNumber=numbers[index];
		
		if(currentNumber<0) {
			continue;//skip the current iteration
		}
		System.out.println(currentNumber*10);
		}
		
	}
}
