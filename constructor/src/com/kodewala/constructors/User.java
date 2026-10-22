package com.kodewala.constructors;

public class User {
	private String username;
    private String password;
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    void displayUsername() {
        System.out.println("Username: " + username);
    System.out.println("Password : "+password);
    }

    public static void main(String[] args) {
        User user = new User("rahul123", "java@123");

        user.displayUsername();
    }
}
