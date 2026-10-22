package com.kodewala.Amazon;

public class Customer {
	protected int customerId;
	// class PrimeCustomer extends Customer
	// protected member can be accessed by the child class under Java's
	// protected-access rules.
	/**
	 * Q: Why use protected instead of private? protected allows access within the
	 * same package and also provides subclass access, whereas private restricts
	 * direct access to the declaring class.
	 */
	protected String customerName;

	private String email;
	/**
	 * Q: Why make a variable private? The email cannot be directly accessed from
	 * outside the Customer class. To prevent direct external access and control how
	 * the data is accessed or modified.
	 */
	static String company = "Amazon";

	/**
	 * company belongs to the class, not separately to every customer. Because the
	 * company name is common to all Customer objects.
	 */
	Customer() {
		this(0, "Unknown", "Unknown");// no-argument constructor.
		/**
		 * this(...)
		 * 
		 * It calls another constructor in the same class. This is called constructor
		 * chaining.
		 */
		/**
		 * Interview Q: What is this()? Answer: this() is used to call another
		 * constructor of the same class. Important rule this() must be the first
		 * statement inside a constructor.
		 */
	}

	/**
	 * This constructor accepts customer information. This is called a parameterized
	 * constructor.
	 * 
	 * @param customerId
	 * @param customerName
	 * @param email
	 */
	Customer(int customerId, String customerName, String email) {
		this.customerId = customerId;
		/**
		 * Q: Why do we use this here? Answer: Because the instance variable and
		 * constructor parameter have the same name. this refers to the current object.
		 */
		this.customerName = customerName;
		this.email = email;
	}

	public static void showCompany() {
		System.out.println("Company: " + company);
		/**
		 * Q: Can a static method be called using the class name? Answer: Yes.
		 * Customer.showCompany();
		 * 
		 * is the preferred style.
		 */
	}

	public void displayCustomer() {
		/**
		 * Static method Customer.showCompany();
		 * 
		 * Instance method customer.displayCustomer();
		 */
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Email: " + email);
		// The Customer class can directly access its own private variable
	}
}

// child class

class PrimeCustomer extends Customer {
	/**
	 * PrimeCustomer is the child. Customer is the parent. Q: Which keyword is used
	 * for class inheritance? Answer: extends
	 */
	private boolean prime;

	/**
	 * private boolean prime;
	 * 
	 * This stores whether the customer has Prime membership. boolean can contain:
	 * true false
	 */

	PrimeCustomer() {
		this(0, "Unknown", "Unknown");
	}

	PrimeCustomer(int id, String name, String email) {
		super(id, name, email);
		/**
		 * super() super(id, name, email);
		 * 
		 * This calls the constructor of the parent class.
		 */

		this.prime = true;
		/**
		 * this() → another constructor in same class
		 * 
		 * super() → constructor in parent class
		 * 
		 * Both must be the first statement of a constructor, so you cannot put both
		 * directly as first statements in the same constructor.
		 */
	}

	public void displayPrimeCustomer() {
		displayCustomer();
		/**
		 * The child uses the method inherited from Customer. This is one of the main
		 * benefits of inheritance: Code reusability.
		 * 
		 * We don't have to rewrite customer display logic.
		 */
		System.out.println("Prime: " + prime);
	}
}
