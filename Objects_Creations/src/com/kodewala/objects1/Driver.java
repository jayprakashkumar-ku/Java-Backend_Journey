package com.kodewala.objects1;

public class Driver {
public static void main(String[] args) {
	System.out.println("main ()!START");
	Hospital pat1=new Hospital("Nisha","KOD123", 4500);
	Hospital pat2=new Hospital("pinki","KOD423", 500);
	Hospital pat3=new Hospital("Rahul","KO123", 400);
	Hospital pat4=new Hospital("Nisha","KOD123", 4500);
	System.out.println("Total Patient!! "+Hospital.patient);
	System.out.println("main()! END!!");
}}
