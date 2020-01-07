package com.codingdojo.objectmaster;

public class Ninja extends Human {
	
	public Ninja() {
		this.setStealth(10);
	}
	
//takes the amount of stealth the Ninja has, removes it from the other human's health, and adds it to the ninja's
	public void steal(Human human) {
		healthDelta = this.getStealth();
		human.adjustHealth(-healthDelta);
		this.adjustHealth(healthDelta);
	}
	
// Decreases ninja's health by 10	
	public void run() {
		healthDelta = -10;
		this.adjustHealth(healthDelta);
	}
}