package com.kodewala.Inheritance;
class User0{
	String name0;
	void login() {
		System.out.println(name0 +" logged in");
	}
}

class Customer0 extends User0
{
void placeOrder() {
	System.out.println(name0+" placed an Order!");
}	
}

class PremiumCustomer extends Customer0{
	void applyPremiumDiscount() {
		System.out.println("Premium discount applied!");
	}
}
public class ShoppingDemo {
	
public static void main(String[] args) {
	PremiumCustomer customer=new PremiumCustomer();
	customer.name0="Jay Prakash Kumar";
	customer.login();
	customer.placeOrder();
	customer.applyPremiumDiscount();
}
}
