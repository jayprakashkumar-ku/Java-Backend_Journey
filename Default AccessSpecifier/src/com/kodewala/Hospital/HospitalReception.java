package com.kodewala.Hospital;

public class HospitalReception {
	 public static void main(String[] args) {

	        Patient p1 = new Patient(
	            101,
	            "Rahul",
	            "Fever",
	            5000
	        );

	        Patient p2 = new Patient(
	            102,
	            "Amit",
	            "Fracture",
	            15000
	        );
	     // default members can be accessed
	        System.out.println(p1.patientName);
	        System.out.println(p2.disease);

	        p1.displayPatient();
	        p2.displayPatient();

	        Patient.displayHospital();
	    }
}
