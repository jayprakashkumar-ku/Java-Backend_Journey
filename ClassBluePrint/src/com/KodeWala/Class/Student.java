package com.KodeWala.Class;

public class Student {
	String studentName;
    int rollNumber;
    String course;
    double marks;

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.studentName = "Rahul";
        s1.rollNumber = 25;
        s1.course = "Java";
        s1.marks = 85.5;

        System.out.println("Name: " + s1.studentName);
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Course: " + s1.course);
        System.out.println("Marks: " + s1.marks);
    }
}
