package com.java.day_six.overriding;

public class demo {
	public static void main(String[] args) {
		
		sbi sbiBank;
		
		sbiBank = new rbi();
			System.out.println(sbiBank.rateOfInterest());
			
			sbiBank = new canara();
			System.out.println(sbiBank.rateOfInterest());
	}
}
