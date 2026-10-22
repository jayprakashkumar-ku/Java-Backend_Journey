package com.kodewala.TypeConversion;

public class DailyTransaction {
public static void main(String[] args) {
long t1 =150000L;
long t2=275000L;
long t3 = 99_900L;
long t4 = 420_000L;
long t5 = 55_100L;



long totalPaise =Math.addExact(Math.addExact(Math.addExact(t1, t2), Math.addExact(t3, t4)), t5);
//Math.addExact(Math.addExact(Math.addExact(t1, t2),Math.addExact(t3, t4)),t5);

System.out.println("Total in paise: " + totalPaise);
System.out.println("Total in rupees: Rs. " + totalPaise / 100.0);
}
}
