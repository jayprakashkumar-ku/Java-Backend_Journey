package com.kodewala.command_line_aguments;

public class PhonePeBatchTotal {
public static void main(String[] args) {
	if(args.length==0)
	{
		System.out.println("Pass at least one amount");
	return;
	}
	long total=0;
	int validCount=0;
	int inValid=0;
	for(int i=0;i<args.length;i++)
	{
		long amount=Long.parseLong(args[i]);
				
	if(amount <=0)
	{
		inValid++;
		System.out.println("Skkiping :"+amount);
		continue;
		
	}
	total += amount;
	validCount++;
}
	System.out.println("InValid payments: " + inValid);
	 System.out.println("Valid payments: " + validCount);
     System.out.println("Total: Rs. " + total);
}}
