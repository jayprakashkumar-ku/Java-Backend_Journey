package com.kodewala.Polymorphism4;

public class VipCustomer extends Customer {
	@Override
	public void doOrder() {
		System.out.println("VIPCustomerOrder.doOrder().......Order!");
	}

}
