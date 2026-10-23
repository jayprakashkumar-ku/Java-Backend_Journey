package com.amazon.reseller.notification;

import com.amazon.retail.notification.Notification;

// notify the reseller when stock is less

public class ResellerNotification extends Notification// developer y -->Child Class
{
	public static void main(String[] args) {
		ResellerNotification notification = new ResellerNotification();
		System.out.println("ResellerNotification.main()" + notification.fromAddress);// from parent class we are reusing
																						// it!
		notification.sendNotification("munna1232@gmail.com", "2023");// from parent class reuse it!
		System.out.println(notification.hashCode());
	}
}
