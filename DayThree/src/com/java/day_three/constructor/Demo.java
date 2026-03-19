package com.java.day_three.constructor;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int id;
		String city;
		
		System.out.println("Enter client name : ");
		name = sc.next();
		
		sc.nextLine();
		System.out.println("Enter client id : ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter client city");
		city = sc.next();
		
		System.out.println();
		
		//default
		Client c1 = new Client();
		
		c1.setName(name);
		c1.setId(id);
		c1.setCity(city);
		System.out.println(c1);
		
		System.out.println("******************************");
		System.out.println();
		
		System.out.println("Enter client name : ");
		name = sc.next();
		
		sc.nextLine();
		System.out.println("Enter client id : ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter client city");
		city = sc.next();
		
		System.out.println();
		
		Client c2 = new Client(name, id, city);
		System.out.println(c2);
		
		
	}
}
