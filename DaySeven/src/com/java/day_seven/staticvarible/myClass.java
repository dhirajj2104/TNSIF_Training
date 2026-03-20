package com.java.day_seven.staticvarible;

public class myClass {
	
	private int department;
	
	private static int no;
	
	static {
		System.out.println("******************");
		no = 100;
		System.out.println("hello");
	}
	
	myClass(){
		System.out.println("/////////////////");
		no++;
		department++;	}

	@Override
	public String toString() {
		return "myClass [department=" + department + ", Number=" + no + "]";
	}
	
	static void display() {
		System.out.println(no);
	}
	
}
