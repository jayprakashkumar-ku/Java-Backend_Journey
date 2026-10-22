package com.kodewala.strings6;

class AccountMgmt// This class can not become parent
{

	final int UPI_LIMIT = 100000;// constant in java

	public final void doSomething1() {
//UPI_LIMIT = 2000000;	//able to change the value
	}

	public void doSomething2() {
		// this is not final so it can be overrfide
	}
}

class Account extends AccountMgmt {

//	public final void doSomething1()
//	{
//		//can not override the method
//	}
//	
	public void doSomething2() {
		// this can not override
	}
}

public class Driver {
	public static void main(String[] args) {

	}
}
