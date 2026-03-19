package com.java.day_three.encapsulation;

public class Demo {
	public static void main(String[] args) {
		ConceptOfOops obj = new ConceptOfOops();
		
		obj.setYour_name("dhiraj");
		obj.setFather_name("vilas");
		obj.setSurname("jadhav");
		
		System.out.println(obj.getYour_name());
		System.out.println(obj.getFather_name());
		System.out.println(obj.getSurname());
		
		System.out.println(obj);
	}
}
