package com.java.day_six.overloading;

public class demo {
	public static void main(String[] args) {
		
		multiplication mul = new multiplication();
		
		System.out.println(mul.Multiplication(5, 2));
		
		System.out.println(mul.Multiplication(1, 2, 3));
		
		System.out.println(mul.Multiplication(8f, 3f));
		
		System.out.println(mul.Multiplication(7f, 2f, 4f));
	}
}
