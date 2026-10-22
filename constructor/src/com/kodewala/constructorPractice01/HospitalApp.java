package com.kodewala.constructorPractice01;

public class HospitalApp {
public static void main(String[] args) {
	 Patient p1 = new Patient(101, "Rahul", "Fever");
     Patient p2 = new Patient(102, "Amit", "Fracture");

     p1.displayPatient();
     System.out.println();

     p2.displayPatient();
}
}
