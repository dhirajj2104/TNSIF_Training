package com.java.day_five.multilevelinheritance;

public class character extends comics{
	
	private String characterName;
	private String allies;
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getAllies() {
		return allies;
	}
	public void setAllies(String allies) {
		this.allies = allies;
	}
	@Override
	public String toString() {
		return "character [characterName=" + characterName + ", allies=" + allies + "]";
	}
	
}
