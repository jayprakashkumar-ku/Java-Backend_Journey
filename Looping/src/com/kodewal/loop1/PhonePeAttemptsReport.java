package com.kodewal.loop1;

import java.util.Scanner;

public class PhonePeAttemptsReport {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int totalFailures=0;
	
	for(int user = 1;user <=3;user++)
	{
		int success=0;
		
		for(int attempts = 1; attempts<=3;attempts++)
		{
			System.out.println("User "+user +",attempts :"+attempts+"  1=success, 0=failed: ") ;
			int result = sc.nextInt();
			
			if(result == 1) {
				success++;
			}
			else if(result==0)
			{
				totalFailures++;
			}
			else {
				System.out.println("Invalid result!: Not counted");
			}
		}
		System.out.println("User "+user+ " successful attempts: "+success);
	}
	System.out.println("Total failure : "+totalFailures);
	sc.close();
}
}
