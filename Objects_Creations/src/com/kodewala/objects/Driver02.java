package com.kodewala.objects;

public class Driver02 {
public static void main(String[] args) {
	UserLogic user1=new UserLogic("ABC458","Kodewala", "Paid");
	UserLogic user2=new UserLogic("ABC458","Kodewala", "Paid");
	UserLogic user3=new UserLogic("ABC458","Kodewala", "Paid");
	UserLogic user4=new UserLogic("ABC458","Kodewala", "Paid");
	
	UserLogic user5=new UserLogic("Munna", "Free");
	UserLogic user6=new UserLogic("KOD58");
	System.out.println("Total LiveUser are : "+UserLogic.liveUserCount);
}
}
