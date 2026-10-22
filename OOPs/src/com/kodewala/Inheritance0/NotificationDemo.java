package com.kodewala.Inheritance0;

class Notification{
	void send() {
		System.out.println("Sending a notification");
	}
}
class EmailNotification extends Notification{
	@Override
void send(){
	System.out.println("Sending Email Notification!");
}
}

class SMSNotification extends Notification{
	@Override
	void send() {
		System.out.println("Sending SMS Notification!");
	}
}
public class NotificationDemo {
public static void main(String[] args) {

	//EmailNotification email=new EmailNotification();
	//email.send();
	
	//SMSNotification sms=new SMSNotification();
	//sms.send();
	
	Notification notification;
	notification=new EmailNotification();
	notification.send();
	
	notification =new SMSNotification();
	notification.send();
}
}
