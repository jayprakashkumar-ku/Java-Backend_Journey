package com.kodewala.control.flow2;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Driver driver=new Driver();
	System.out.println("Enter the value to get Weeks of the Day!!");
	Scanner sc=new Scanner(System.in);
	int day=sc.nextInt();
	
	//int day=Integer.parseInt(args[0]);
	driver.identifyDay(day);
	sc.close();
	
	
}
//Identify the day based on the number supplied
public void identifyDay(int number) {
	switch(number) {
	case 1:
		System.out.println("MON");
		break;
		
	case 2:
		System.out.println("TUE");
		break;
	case 3:
		System.out.println("WED");
		break;
	case 4:
		System.out.println("THU");
		break;
	case 5:
		System.out.println("FRI");
		break;
	case 6:
		System.out.println("SAT");
		break;
	case 7:
		System.out.println("SUN");
		break;
		default:
			System.out.println("Enter the valid Value within (1-7)days!!");
	}
}
}
