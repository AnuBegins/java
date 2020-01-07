package com.codingdojo.zookeeper;


public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("Threw his feces!");
		adjustEnergy(-5);
	}
	
	public void eatBanana() {
		System.out.println("Ate some bananas.");
		adjustEnergy(10);
	}
	
	public void climb() {
		System.out.println("Tried to climb a tree. ");
		adjustEnergy(-10);
	}
	
}
