package com.java.day_six.payment;

public class fundTransfer {
	
	 // 1. GPay
    void pay(long mobileNo, double amount, int pin) {
        System.out.println("Payment via GPay");
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Amount: " + amount);
    }

    // 2. Cheque
    void pay(String name, double amount, int pin, String date) {
        System.out.println("\nPayment via Cheque");
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
    }

    // 3. Net Banking
    void pay(String username, String password, double amount) {
        System.out.println("\nPayment via Net Banking");
        System.out.println("Username: " + username);
        System.out.println("Amount: " + amount);
    }

    // 4. ATM
    void pay(long cardNo, int pin, double amount) {
        System.out.println("\nPayment via ATM");
        System.out.println("Card No: " + cardNo);
        System.out.println("Amount: " + amount);
    }

    // 5. Demand Draft (DD)
    void pay(String name, double amount) {
        System.out.println("\nPayment via Demand Draft (DD)");
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
    }
}
