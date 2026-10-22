package com.KodeWala.class02;

public class PatientMain {
public static void main(String[] args) {
	Patient pat1=new Patient();
	pat1.patientId="PAT101";
	pat1.patientName="Munna Kumar";
	pat1.disease="Typhoid";
	pat1.displayPatientDetails();
	System.out.println("-------------------------");
       
	   
	Patient pat2=new Patient();
	pat2.patientId="PAT102";
	pat2.patientName=" Kumar";
	pat2.disease="Malaria";
	pat2.displayPatientDetails();
	System.out.println("-------------------------");
	   
	Patient pat3=new Patient();
	pat3.patientId="PAT103";
	pat3.patientName="Amit";
	pat3.disease="Denguoo";
	pat3.displayPatientDetails();
	System.out.println("-------------------------");
}
}
