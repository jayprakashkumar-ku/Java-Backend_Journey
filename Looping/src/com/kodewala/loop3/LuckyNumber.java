package com.kodewala.loop3;

import java.util.Scanner;

public class LuckyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int luckynum=21;
	int usernum=0;
	while(usernum!=luckynum)
	{
		System.out.println("Enter You Lucky Number!!!");
		usernum=sc.nextInt();
		if(usernum==luckynum)
		{
			System.out.println("Well Played you won Game!!");
			
		}else {
			System.out.println("Better Luck Next Time!!!");
			usernum++;
		}
	}
	sc.close();
}
}
