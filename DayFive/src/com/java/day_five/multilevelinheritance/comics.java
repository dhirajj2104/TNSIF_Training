package com.java.day_five.multilevelinheritance;

public class comics {
	
	private String comicName;
	private int origin;
	
	public String getComicName() {
		return comicName;
	}
	public void setComicName(String comicName) {
		this.comicName = comicName;
	}
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return "comics [comicName=" + comicName + ", origin=" + origin + "]";
	}
	
	
}
