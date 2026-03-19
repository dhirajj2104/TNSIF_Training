package com.java.day_three.constructor;

public class Client {
	
	private String name;
	private int id;
	private String city;
	
	//default constructor
	public Client() {
		System.out.println("Default.....");
	}

	//parameterized constructor
	public Client(String name, int id, String city) {
		this();
		
		System.out.println("parameterized constructor");
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
}
