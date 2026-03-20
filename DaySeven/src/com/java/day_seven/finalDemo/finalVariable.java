package com.java.day_seven.finalDemo;

public class finalVariable {
	
	final int a = 10;
	
	final static int b;
	
	final static int c = 15;
	
	//instance method
	
	void changes() {
		
	}

	@Override
	public String toString() {
		return "finalVariable [a=" + a + ", b=" + b + "]";
	}
	
	//static block initialize to final static variable
	
	static {
		b = 12;
		
		System.out.println("value of b : " + b);
		System.out.println("value of c : " + c);
	}
}
