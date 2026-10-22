package com.kodewala.hospital;

public class HospitalSystem {
	public static void main(String[] args) {
		EmergencyPatient p1 = new EmergencyPatient(101, "Ravi", "Accident", "Critical");
		EmergencyPatient p2 = new EmergencyPatient(102, "Amit", "Burn Injury", "Serious");
		p1.displayEmergency();
		p2.displayEmergency();

		Patient.displayHospital();
	}
}
