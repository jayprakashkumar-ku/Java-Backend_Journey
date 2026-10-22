package com.kodewala.BankAccount;

public class BankEmployee {
	protected int employeeId;
    protected String employeeName;
    
    private double salary;

    static String bankName = "State Bank";
    BankEmployee(int employeeId, String employeeName,
            double salary) {

   this.employeeId = employeeId;
   this.employeeName = employeeName;
   this.salary = salary;
}

void displayEmployee() {

   System.out.println("Employee ID: " + employeeId);
   System.out.println("Employee Name: " + employeeName);
   System.out.println("Salary: " + salary);
}
static void displayBank() {

    System.out.println("Bank: " + bankName);
}

}

class Manager extends BankEmployee {
	private String department;

    Manager(int employeeId, String employeeName,
            double salary, String department){
    super(employeeId, employeeName, salary);
    this.department = department;
}
    void displayManager() {

        // protected members can be directly accessed
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
    }

}