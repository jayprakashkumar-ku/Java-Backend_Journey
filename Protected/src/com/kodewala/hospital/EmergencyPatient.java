package com.kodewala.hospital;



public class EmergencyPatient extends Patient {
	private String emergencyType;

	public EmergencyPatient(int patient_id, String _patientName, String _disease, String emergencyType) {
		super(patient_id, _patientName, _disease);
		this.emergencyType = emergencyType;
	}

	public void displayEmergency() {

		// protected members are accessible
		System.out.println("Patient ID: " + patientId);
		System.out.println("Patient Name: " + patientName);
		System.out.println("Emergency: " + emergencyType);
	}

}
