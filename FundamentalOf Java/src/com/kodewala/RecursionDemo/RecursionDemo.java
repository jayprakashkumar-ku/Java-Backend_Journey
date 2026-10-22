package com.kodewala.RecursionDemo;

public class RecursionDemo {
static void count(int number)
{
if(number>5) {
	return;
}

System.out.println(number);
count(number+1);
}

public static void main(String[] args) {
	count(1);
}
}
