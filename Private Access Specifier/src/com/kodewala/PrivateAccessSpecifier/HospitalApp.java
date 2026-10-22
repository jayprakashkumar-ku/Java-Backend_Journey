package com.kodewala.PrivateAccessSpecifier;

public class HospitalApp {
public static void main(String[] args) {
	Patient patient1=new Patient();
	patient1.setPatientDetails(101,"Rahul Kumar", "Fever");
	Patient patient2 = new Patient();

    patient2.setPatientDetails(102,"Priya","Cold");
    Patient.displayHospital();

    System.out.println();

    patient1.displayPatient();

    System.out.println();

    patient2.displayPatient();
}
}
