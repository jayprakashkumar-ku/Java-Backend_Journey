package com.kodewala.loop3;

public class Driver2 {
	public static void main(String[] args) {
		String[] cities = { "Bengaluru", "Mumbai", "Delhi", "Chennai", "Bengaluru", "Hyderabad", "Pune", "Kolkata",
				"Nagpur", "Bengaluru", "Pune" };
		// find if the Bangalore is part of list or not
		for (int index = 0; index < cities.length; index++) {
			String currentCity = cities[index];
			if (currentCity.equals("Bengaluru")) {
				System.out.println("Bengaluru is the part of city list!!");
				break;// break the loop-->you will come out of the loop
			}
		}
	}
}
