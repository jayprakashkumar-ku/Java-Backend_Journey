package com.kodewala.Hospital;

public class Patient {
int patientId;
String patientName;
String disease;

private double billAmount;

static String hospitalName = "City Care Hospital";

Patient(int patientId, String patientName,
        String disease, double billAmount) {
	this.patientId = patientId;
    this.patientName = patientName;
    this.disease = disease;
    this.billAmount = billAmount;}
    void displayPatient() {

        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Disease: " + disease);
        System.out.println("Bill Amount: " + billAmount);
    }

    // static method
    static void displayHospital() {

        System.out.println("Hospital: " + hospitalName);
    }


}
