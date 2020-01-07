package com.codingdojo.objectmaster;

public class Samurai extends Human {
	
	public Samurai () {
		this.setHealth(200);
		Human.counter++;
	}
	
// Kills a human but reduces Samurai's health by half	
	public void deathBlow(Human human) {
		human.setHealth(0);
		healthDelta = -(this.getHealth() / 2);
		this.adjustHealth(healthDelta);
	}
	
// Raises samurai's health by 50%	
	public void meditate() {
		healthDelta = this.getHealth() / 2;
		this.adjustHealth(healthDelta);
	}
	
	
	public int howMany() {
		return Human.counter;
	}
	
	
}
