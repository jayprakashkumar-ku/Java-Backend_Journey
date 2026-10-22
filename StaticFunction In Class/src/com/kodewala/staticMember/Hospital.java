package com.kodewala.staticMember;

public class Hospital {
static String companyName="ABC Technolgies";
static void displayCompany() {
	System.out.println("Comapny : "+companyName);
}
public static void main(String []args) {
	Hospital.displayCompany();
}
}
