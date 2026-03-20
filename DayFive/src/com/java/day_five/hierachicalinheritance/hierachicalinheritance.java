package com.java.day_five.hierachicalinheritance;

import java.util.Scanner;

public class hierachicalinheritance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		people p = new people();
		System.out.println(p);
		
		p = new bankEmployee();
		p.setName("runika");
		p.setAge(24);
		
		System.out.println(p);
		
		

		System.out.println("**********************************************");
		
		p = new bankCustomer("sneha", 21, "current", 8549);
		System.out.println(p);
		
		System.out.print("Enter name : ");
		String name = sc.next();
		
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter account type : ");
		String accountType = sc.next();
		
		System.out.print("Enter balance : ");
		int balance = sc.nextInt();
		
		bankCustomer be = new bankCustomer();
		
		be.setName(name);
		be.setAge(age);
		be.setAccountType(accountType);
		be.setBalance(balance);
		
		System.out.println(be);
		
	}
}
