package com.kodewala.LoopStatement;

public class Driver {
public static void main(String[] args) {
	String cities[]=new String[7];
	cities[0]="Bangalore";
	cities[1]="Chennai";
	cities[2]="Srinagar";
	cities[3]="Mumbai";
	cities[4]="mysore";
	cities[5]="surat";
	cities[6]="Shimla";
	for(int index=0;index<cities.length;index++) {
		if(cities[index].startsWith("S")) {
			System.out.println("City starting with 'S' : "+cities[index]);
		}
	}
}
}
