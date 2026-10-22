package com.kodewala.constructorPractice01;

public class Patient {
	private int patientId;
    private String patientName;
    private String disease;
    
    private static String hospitalName = "City Care Hospital";
    
    Patient(int patientId, String patientName, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
    }
    void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Disease: " + disease);
        System.out.println("Hospital: " + hospitalName);
    }

}


