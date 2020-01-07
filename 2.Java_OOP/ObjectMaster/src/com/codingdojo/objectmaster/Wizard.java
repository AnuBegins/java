package com.codingdojo.objectmaster;

public class Wizard extends Human {

// Default health and intelligence	
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	
// Heals a human by the wizard's intelligence	
	public void heal(Human human) {
		healthDelta = this.getIntelligence();
		human.adjustHealth(healthDelta);
	}

// Decreases human's health by the wizard's intelligence * 3	
	public void fireball(Human human) {
		int damage = this.getIntelligence() * 3;
		human.adjustHealth(-damage);
	}
}
