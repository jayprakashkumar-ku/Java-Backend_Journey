package com.kodewala.objects1;

public class Hospital {
private String patientName;
private String  patientId;
private int bill;
public static int patient=0;


{

patient=patient + 1;

}
public Hospital(String patientName, String patientId, int bill) {
	super();
	
	this.patientName = patientName;
	this.patientId = patientId;
	this.bill = bill;
}
static {
	System.out.println("City Hospital!!");
	
}
}
