package com.kodewala.Inheritance02;

public class ElectronicProduct extends Product{
	boolean iswarranty;
	int warrantyInvYears;
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean iswarranty,
			int warrantyInvYears)
	{
		super(productName, description, quantity, status);
		this.iswarranty = iswarranty;
		this.warrantyInvYears = warrantyInvYears;
	}
	public void viewElectronicProductDetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(iswarranty);
		System.out.println(warrantyInvYears);
	}

}
