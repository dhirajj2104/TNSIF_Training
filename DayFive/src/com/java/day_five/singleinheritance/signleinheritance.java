package com.java.day_five.singleinheritance;

import java.util.Scanner;

public class signleinheritance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, city, department, gender;
		int age, employeeId;
		
		System.out.print("Enter your name : ");
		name = sc.next();
		
		System.out.print("Enter your city : ");
		city = sc.next();
		
		System.out.print("Enter your gender : ");
		gender = sc.next();
		
		System.out.print("Enter your department : ");
		department = sc.next();
		
		System.out.print("Enter your age : ");
		age = sc.nextInt();
		
		System.out.println("Enter you employee Id : ");
		employeeId = sc.nextInt();
		
		
		employees em = new employees();
		
		em.setName(name);
		em.setCity(city);
		em.setGender(gender);
		em.setDepartment(department);
		em.setAge(age);
		em.setEmployeeId(employeeId);
		
		System.out.println(em);
	}
}
