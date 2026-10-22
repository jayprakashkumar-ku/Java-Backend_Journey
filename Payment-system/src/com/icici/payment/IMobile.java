package com.icici.payment;

public class IMobile {
public void main() {
	System.out.println("IMobile.main() START");
	doPayment(1000,"7461813651","4225898952","7965216356");
	System.out.println("IMobile.main()END");
	
}
public static void main(String[]args)
{
System.out.println("IMobile.main()START");
doPayment(1000,"7461813651","4225898952","7965216356");
System.out.println("IMobile.main()END");

}
private static void doPayment(int amount,String recAccNo,String senderAccNo,String mob) {
System.out.println("IMobile.doPayment()START");
System.out.println(amount);
System.out.println(recAccNo);
System.out.println(senderAccNo);
System.out.println(mob);

sendSMS(mob);
System.out.println("IMobile.doPayment() END");
}
private static void sendSMS(String mobile)
{
	System.out.println("IMobile.sendSMS()START");
	System.out.println("IMobile.sendSMS()...txn has been done.. sending notification to mobile# "+ mobile);
	System.out.println("IMobile.sendSMS()END");
	}
}