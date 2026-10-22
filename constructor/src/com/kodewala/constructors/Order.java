package com.kodewala.constructors;

public class Order {
	int quantity;
    double price;
    double total;

Order(int quantity, double price){
	
	this.quantity = quantity;
    this.price = price;
    this.total = quantity * price;
}
void display() {
    System.out.println("Quantity: " + quantity);
    System.out.println("Price: " + price);
    System.out.println("Total: " + total);
}

public static void main(String[] args) {
    Order order = new Order(3, 1000);

    order.display();
}
}
