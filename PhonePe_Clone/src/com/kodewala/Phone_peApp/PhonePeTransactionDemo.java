package com.kodewala.Phone_peApp;

class PhonePeTransaction {
	String transactionId;
	long amount;
	static int transactionIdCount = 0;

	void displayTransaction() {
		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Amount: Rs. " + amount);
	}

	PhonePeTransaction(String id) {
		transactionId = id;
		transactionIdCount++;
	}
}

public class PhonePeTransactionDemo {
	public static void main(String[] args) {

		// Transaction 1 ka object
		PhonePeTransaction t1 = new PhonePeTransaction("BG101");

		// Transaction 2 ka object
		PhonePeTransaction t2 = new PhonePeTransaction("XY102");
		PhonePeTransaction t3 = new PhonePeTransaction("XY103");
		PhonePeTransaction t4 = new PhonePeTransaction("XY104");
		t1.displayTransaction();
		t2.displayTransaction();

		System.out.println("First ID : " + t1.transactionId);
		System.out.println("Second Id: " + t1.transactionId);

		System.out.println("Total transactions: " + PhonePeTransaction.transactionIdCount);
	}

}
