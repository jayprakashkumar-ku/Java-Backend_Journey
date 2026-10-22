package com.kodewala.Inheritance0;
class User{
	String name;
	void showProfile() {
		System.out.println("User : "+name);
		
	}
}
class Customer extends User{
void makePayment() {
	System.out.println(name +"is making a payment");
}
}
class Merchant extends User{
	void receivePayment() {
		System.out.println(name +"Received a Payment!");
	}
}
public class PaymentDemo {
public static void main(String[] args) {
	Customer cust1=new Customer();
	cust1.name="Rahul Singh";
	
	Merchant mc1=new Merchant();
	mc1.name="ABC Store";
	
    cust1.showProfile();
    cust1.makePayment();

    mc1.showProfile();
    mc1.receivePayment();

}
}
