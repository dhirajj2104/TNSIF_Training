package com.java.day_three.scanner;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String name;
			System.out.print("Enter your name : ");
			name = sc.next();
			
			String gender;
			System.out.print("Enter your gender : ");
			gender = sc.next();
			
			String Stream;
			System.out.print("Enter your Stream : ");
			Stream = sc.next();
			
			int age;
			System.out.print("Enter your age : ");
			age = sc.nextInt();
			
			int roll_no;
			System.out.print("Enter your roll no. : ");
			roll_no = sc.nextInt();
			
			student st = new student();
			
			st.setName(name);
			st.setGender(gender);
			st.setStream(Stream);
			st.setAge(age);
			st.setRoll_no(roll_no);
			
			System.out.println();
			
			System.out.println(st);
			
			System.out.println();
			
			System.out.println("*******************************************************************************************");
		}
	}
}
