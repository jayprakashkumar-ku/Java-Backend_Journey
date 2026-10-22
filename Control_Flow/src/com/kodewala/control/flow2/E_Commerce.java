package com.kodewala.control.flow2;

public class E_Commerce {

    int minimumpurchase = 1000;
    int userpurchase = 0;
    int discount = 2500;

    public void api(String customer) {

        switch (customer) {

        case "Gold":
            System.out.println("GOLD 20%");

            if (userpurchase >= minimumpurchase) {
            	int discount=userpurchase*20/100;
            	System.out.println("Discount : "+discount);
            	System.out.println("Total amount : "+(userpurchase+discount));
                
            } else {
                System.out.println("Sorry! Discount is not Applicable!");
            }
            break;

        case "Silver":
            System.out.println("SILVER 10%");

            if (userpurchase >= minimumpurchase) {
                System.out.println("Discount is 2500!!");
            } else {
                System.out.println("Sorry! Discount is not Applicable!");
            }
            break;

        case "Regular":
            System.out.println("REGULAR");

            if (userpurchase >= minimumpurchase) {
                System.out.println("Discount is 2500!!");
            } else {
                System.out.println("Sorry! Discount is not Applicable!");
            }
            break;

        default:
            System.out.println("Sorry!!");
            break;
        }
    }

    public static void main(String[] args) {

        E_Commerce ecommerce = new E_Commerce();

        ecommerce.userpurchase = 5000;
        ecommerce.api("Gold");
    }
}