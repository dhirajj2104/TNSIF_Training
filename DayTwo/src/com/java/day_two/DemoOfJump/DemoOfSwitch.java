package com.java.day_two.DemoOfJump;

public class DemoOfSwitch {
	public static void main(String[] args) {
		
		int userInput = 4;
		
		switch(userInput) 
		{
		case 1:
			System.out.println("name");
			break;
		case 2:
			System.out.println("surname");
			break;
		case 3:
			System.out.println("education");
			break;
		case 4:
			System.out.println("language");
			break;
		default:
			System.out.println("wrong information");
			break;
		}
	}
}
