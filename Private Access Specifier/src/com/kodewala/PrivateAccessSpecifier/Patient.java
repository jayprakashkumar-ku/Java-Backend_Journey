package com.kodewala.PrivateAccessSpecifier;

public class Patient {
private int patientID;
private String patientName;
private String disease;

static String hospital="City Care Hospital";
void setPatientDetails(int id,String name,String diseaseName) {
	patientID=id;
	patientName=name;
	disease=diseaseName;
}
void displayPatient() {
	System.out.println("Patient ID: " + patientID);
    System.out.println("Patient Name: " + patientName);
    System.out.println("Disease: " + disease);
}
static void displayHospital() {
	System.out.println("Hospital : "+hospital);
}

}
