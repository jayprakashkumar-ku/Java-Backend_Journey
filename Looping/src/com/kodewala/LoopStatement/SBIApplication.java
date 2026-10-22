package com.kodewala.LoopStatement;

public class SBIApplication {
public static void main(String[] args) {
	
	
	SBIBank Account1=new SBIBank("munna", 2500, "7461813651");
	SBIBank Account2=new SBIBank("kumar", 500, "808813651");
	SBIBank Account3=new SBIBank("prakash", 250, "9961813651");
	SBIBank Account4=new SBIBank("Ladoo", 2500, "78541813651");
	SBIBank Account5=new SBIBank("Riya", 3000, "871813651");
	SBIBank Account6=new SBIBank("Jiya", 8500, "9121813651");
	
	SBIBank customers[]=new SBIBank [8];
	
	customers[0]=Account1;
	customers[1]=Account2;
	customers[2]=Account3;
	customers[3]=Account4;
	customers[4]=Account5;
	customers[5]=Account6;			

	for(int index=0;index < customers.length;index++) {
		if(customers[index].balance < 2000)		 {
			System.out.println(customers[index].name+" " + customers[index].balance);
		}
	}
}
}
