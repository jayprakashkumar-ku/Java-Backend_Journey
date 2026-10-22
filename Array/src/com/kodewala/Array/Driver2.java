package com.kodewala.Array;

public class Driver2 {
public static void main(String[] args) {
	User user1=new User("Munna","7485726578");
	User user2=new User("Kumar","9657425863");
	User user3=new User("prakash","7248596143");
	User user4=new User("Sahil","9247855261");
	User user5=new User("Bittu","9936874580");
	
	User users[]=new User[5];
	
	users[0]=user1;
	users[1]=user2;
	users[2]=user3;
	users[3]=user4;
	users[4]=user5;
	System.out.println(users);
	
}

}
