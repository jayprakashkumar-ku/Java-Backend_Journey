package com.kodewala.MethodsInClass;

public class mainCartItem {
	public static void main(String[] args) {

        CartItem item1 = new CartItem();

        item1.productName = "Laptop";
        item1.price = 50000;
        item1.quantity = 2;


        CartItem item2 = new CartItem();

        item2.productName = "Mouse";
        item2.price = 800;
        item2.quantity = 3;


        item1.calculateTotal();
        item2.calculateTotal();
    }
}
