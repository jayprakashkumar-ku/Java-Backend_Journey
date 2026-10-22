package com.KodeWala.class02;

public class FoodDelivery {
public static void main(String[] args) {
	Order order1=new Order();
	order1.orderId="ORD101";
	order1.customerName="Rudraksh";
	order1.foodItem="pizza";
	order1.price=210;
	System.out.println("-------------------------");
	
	
	Order order2=new Order();
	order2.orderId="ORD102";
	order2.customerName="Prakash";
	order2.foodItem="Burger";
	order2.price=125;
	
	
	Order order3=new Order();
	order3.orderId="ORD101";
	order3.customerName="Bittu";
	order3.foodItem="Samosa,pokoda";
	order3.price=180;
	
	
	order1.displayOrder();
    System.out.println("Final Amount: "
                       + order1.calculateFinalAmount());
    System.out.println("-------------------------");
    
    order2.displayOrder();
    System.out.println("Final Amount: "
                       + order2.calculateFinalAmount());
    System.out.println("-------------------------");
    
	
    order3.displayOrder();
    System.out.println("Final Amount: "
                       + order3.calculateFinalAmount());

}
}
