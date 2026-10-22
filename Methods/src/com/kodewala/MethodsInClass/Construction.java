package com.kodewala.MethodsInClass;

import java.awt.DisplayMode;

public class Construction {
String labourName;
String masonName;
String company;
String work;
int labourSalary;
int masonSalary;

void displayDetails() {
	System.out.println("LabourName :"+labourName);
	System.out.println("MasonName :"+masonName);
	System.out.println("Company :"+company);
	System.out.println("Work :"+work);
	System.out.println("LabourSalary :"+labourSalary);
	System.out.println("MasonSalary :"+masonSalary);
	
}
public static void main(String[]args)
{
	Construction cons=new Construction();
	cons.labourName="Munna";
	cons.masonName="Chottu Kumar";
	cons.company="LNT";
	cons.work="Building";
	cons.labourSalary=21000;
	cons.masonSalary=300000;
	
	cons.displayDetails();
	
	Construction cons1=new Construction();
	cons1.labourName="prakash";
	cons1.masonName="Sambhu Singh";
	cons1.company="LNT";
	cons1.work="Building";
	cons1.labourSalary=20000;
	cons1.masonSalary=310000;
	
	cons1.displayDetails();
}
}
