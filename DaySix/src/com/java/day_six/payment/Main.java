package com.java.day_six.payment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		fundTransfer ft = new fundTransfer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fund Transfer : ");
		System.out.println("1. GPay");
		System.out.println("2. Cheque");
		System.out.println("3. Net Banking");
		System.out.println("4. ATM");
		System.out.println("5. DD");
		System.out.println();
		
		System.out.print("Enter your choise : ");
		int choise = sc.nextInt();
		
		System.out.println();
		
		switch(choise) {
		//GPay
		case 1:
			System.out.println("Enter mobile number : ");
			long mobile = sc.nextLong();
			
			System.out.println("Enter amount : ");
			double amount1 = sc.nextDouble();
			
			System.out.println("Enter pin : ");
			int pin1 = sc.nextInt();
			
			System.out.println();
			ft.pay(mobile, amount1, pin1);
			break;
			
		//Cheque
		case 2:
			System.out.println("Enter name : ");
			String name1 = sc.next();
			
			System.out.println("Enter amount : ");
			double amount2 = sc.nextDouble();
			
			System.out.println("Enter pin : ");
			int pin2 = sc.nextInt();
			
			System.out.println("Enter date : ");
			String date = sc.next();
			
			System.out.println();
			ft.pay(name1, amount2, pin2, date);
			break;
		
		//Net banking
		case 3:
			System.out.println("Enter name : ");
			String name2 = sc.next();
			
			System.out.println("Enter password : ");
			String password = sc.next();
			
			System.out.println("Enter amount : ");
			double amount3 = sc.nextDouble();
			
			System.out.println();
			ft.pay(name2, password, amount3);
			break;
			
		//ATM
		case 4:
			System.out.println("Enter card number : ");
			long card = sc.nextInt();
			
			System.out.println("Enter pin : ");
			int pin3 = sc.nextInt();
			
			System.out.println("Enter amount : ");
			double amount4 = sc.nextDouble();
			
			System.out.println();
			ft.pay(card, pin3, amount4);
			break;
			
		//DD
		case 5:
			System.out.println("Enter name : ");
			String name3 = sc.next();
			
			System.out.println("Enter amount : ");
			double amount5 = sc.nextDouble();
			
			System.out.println();
			ft.pay(name3, amount5);
			break;
			
		default :
			System.out.println("Invalid choise");
		}
		sc.close();
		
	}
}
