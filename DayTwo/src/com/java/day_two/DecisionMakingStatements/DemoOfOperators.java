package com.java.day_two.DecisionMakingStatements;

public class DemoOfOperators {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		System.out.println("x, y and z values :" + x+", "+ y + " and "+ z);
		
		++y; //pre increment
		System.out.println("y after using pre increment operator :"+ y);
		
		--z; //pre decrement
		System.out.println("z after using post increment operator :"+ z);
		
		        //0 + 4 + 2
		int m = --x + ++y + z++;
		System.out.println("Value of m :"+ m);
		
		        //1 + 3 - 3 + 6
		int n = ++x + --y - z-- + m;
		System.out.println("Value of n :"+ n);
		
		
	}
}
