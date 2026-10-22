package com.kodewala.PrivateAccessSpecifier01;

public class EmployeeApp {
	public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.createEmployee(
            501,
            "Amit",
            50000,
            "IT"
        );

        Employee employee2 = new Employee();

        employee2.createEmployee(
            502,
            "Sneha",
            60000,
            "HR"
        );
        Employee.displayCompany();

        System.out.println();

        employee1.increaseSalary(10);

        employee1.displayEmployee();

        System.out.println();

        employee2.displayEmployee();
    }
}
