package com.java.day_two.DemoOfJump;

public class DemoOfContinue {
	public static void main(String[] args) {
		
		for(int g = 10; g<=21; g++) {
			if(g%2 !=1) {
				continue;
			}
			System.out.println(g+" ");
		}
	}
}
