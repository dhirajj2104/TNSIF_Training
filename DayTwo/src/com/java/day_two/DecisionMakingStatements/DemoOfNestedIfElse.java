package com.java.day_two.DecisionMakingStatements;
import java.util.Scanner;

public class DemoOfNestedIfElse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose 1st value : ");
		int a = sc.nextInt();
		
		System.out.print("Choose 2nd value : ");
		int b = sc.nextInt();
		
		System.out.print("Choose 3rd value : ");
		int c = sc.nextInt();
		
		System.out.print("smallest number is : ");
			
		if(a<b) {
			if(a<c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}	
		}
		else {
			if(c<b) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}
	}
}
