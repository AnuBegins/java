package com.codingdojo.objectmaster;

public class Human {
	
	private int strength 		= 3;
	private int stealth 		= 3;
	private int intelligence 	= 3;
	private int health 			= 100;
	public static int counter;
	public int healthDelta;
	
   // Setters //////////////////////////////////////////
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
// Getters ///////////////////////////////////////////
	
	public int getStrength() {
		return strength;
	}
	
	public int getStealth() {
		return stealth;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public int getHealth() {
		return health;
	}
	
// Instance methods ////////////////////////////////////
	public void adjustStrength(int strength) {
		this.strength += strength;
	}
	
	public void adjustStealth(int stealth) {
		this.stealth += stealth;
	}
	
	public void adjustIntelligence(int intelligence) {
		this.intelligence += intelligence;
	}
	
	public void adjustHealth(int health) {
		this.health += health ;
	}
	

	public void attack(Human name) {
		System.out.println(name.toString()+" was just attacked. Health before: " + name.health);
		name.health -= this.strength;
		System.out.println("After attack, his health is " + name.health);

	}
	
	
}