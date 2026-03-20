package com.java.day_seven.staticvarible;

public class Student {
	
	private String name;
	private int rollno;
	
	static String collegeName = "Bharati vidyapeeth";

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", college=" + collegeName + "]";
	}
	
	
	
}
