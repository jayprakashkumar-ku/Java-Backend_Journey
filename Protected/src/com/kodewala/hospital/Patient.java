package com.kodewala.hospital;

public class Patient {
	protected int patientId;
	protected String patientName;

	private String disease;

	static String hospitalName = "City Hospital";

	public Patient(int patient_id, String _patientName, String _disease) {
		this.patientId = patient_id;
		this.patientName = _patientName;
		this.disease = _disease;
	}

	public void displayPatient() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Patient Name: " + patientName);
		System.out.println("Disease: " + disease);
	}

	public static void displayHospital() {
		System.out.println("Hospital : " + hospitalName);
	}
}
