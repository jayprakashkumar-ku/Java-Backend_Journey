package com.kodewala.constructor2;

class Invoice {
static int gst=18;
int amount;
String itemName;
String bilingAddress;
String customerId;
String customerName;

Invoice(int _amount,String _itemName,String _billingAddress,String _customerId,String _customerName)
{
	this.amount=_amount;
	this.itemName=_itemName;
	this.bilingAddress=_billingAddress;
	this.customerId=_customerId;
	this.customerName=_customerName;
	
}
}
public class Drive{
	public static void main(String[] args) {
		Invoice inv=new Invoice(180000,"iphone18","kodewala BTM 2nd Stage,Bangalore","C4358","kodewala");
		Invoice inv1=new Invoice(500000,"Oppo","kodewala BTM 2nd Stage,Bangalore","C0351","Ajay");
		System.out.println("first invoice : "+inv.amount +" , "+inv.customerId+" , "+Invoice.gst);
		System.out.println("2nd invoice : "+inv1.amount +" , "+inv1.customerId+" , "+Invoice.gst);
	}
}

