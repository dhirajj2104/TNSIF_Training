package com.java.day_five.singleinheritance;

public class people {
	
	private String name;
	private String gender;
	private int age;
	private String city;
	
	public people() {
		System.out.println("People obj");
	}

	public people(String name, String gender, int age, String city) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "people [name=" + name + ", gender=" + gender + ", age=" + age + ", city=" + city + "]";
	}
	
	
}
