package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	
	public void setBatEnergy() {
		this.setEnergy(300);
	}
	
	public void fly() {
		System.out.println("Flap Flap Flap");
		adjustEnergy(-50);
	}
	
	public void eatHumans() {
		System.out.println("The bat just ate a dude. Yummy ! Chomp chomp !");
		adjustEnergy(25);
	}	
	
	public void attackTown() {
		System.out.println("HELLLLLLLP ! The bat attacked a town! ");
		adjustEnergy(-100);
	}

}
