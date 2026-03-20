package com.java.day_five.multilevelinheritance;

import java.util.Scanner;

public class multilevelinheritance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String comicName, characterName, allies, power, notableThing;
		int origin;
		
		System.out.print("Enter comic name : ");
		comicName = sc.next();
		
		System.out.print("Enter origin year : ");
		origin = sc.nextInt();
		
		System.out.print("Enter character name: ");
		characterName = sc.next();
		
		System.out.print("Enter allies(hero/villain) : ");
		allies = sc.next();
		
		System.out.print("Enter powers : ");
		power = sc.next();
		
		System.out.print("Enter notable things about your character : ");
		notableThing = sc.next();
		
		powers p = new powers();
		
		p.setComicName(comicName);
		p.setOrigin(origin);
		p.setCharacterName(characterName);
		p.setAllies(allies);
		p.setPower(power);
		p.setNotableThing(notableThing);
		
		System.out.println(p);
	}
}
