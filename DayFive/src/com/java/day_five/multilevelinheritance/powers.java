package com.java.day_five.multilevelinheritance;

public class powers extends character{
	
	private String power;
	private String notableThing;
	
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getNotableThing() {
		return notableThing;
	}
	public void setNotableThing(String notableThing) {
		this.notableThing = notableThing;
	}
	@Override
	public String toString() {
		return "powers [power=" + power + ", notableThing=" + notableThing + ", getCharacterName()="
				+ getCharacterName() + ", getAllies()=" + getAllies() + ", getComicName()=" + getComicName()
				+ ", getOrigin()=" + getOrigin() + "]";
	}
	
	
	
}
