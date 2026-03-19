package com.java.day_three.encapsulation;

public class ConceptOfOops {
	
	private String your_name;
	private String father_name;
	private String surname;
	
	public String getYour_name() {
		return your_name;
	}
	public void setYour_name(String your_name) {
		this.your_name = your_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "Your Information [your_name=" + your_name + ", father_name=" + father_name + ", surname=" + surname + "]";
	}
	
	
}
