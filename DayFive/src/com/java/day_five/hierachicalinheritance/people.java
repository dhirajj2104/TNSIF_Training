package com.java.day_five.hierachicalinheritance;

public class people {
	
	private String name;
	private int age;
	
	
	public people() {
		System.out.println("default");
		name = "om";
		age = 22;
	}

	public people(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "people [name=" + name + ", age=" + age + "]";
	}
	
	
}
