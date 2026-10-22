package com.kodewala.control.flow;

public class Booking {
//more than 6 pax per PNR is not allowed.
	public String doBooking(String from,String to,int noOfPax)
	{
		String pnr=null;
		if(noOfPax > 6) 
		{//If true then only below code gets executed.
			System.out.println("As per IRCTC Policy.Only 6 pax are allowed per PNR");
	}
	else{
		//confirming the Booking
		pnr = "33467854";
		System.out.println("Confirming the Booking : "+pnr);
		System.out.println("Status :  CONFIRMED");
		System.out.println("SEAT : 23 A1");
		
	}
	return pnr;	
	}
}
