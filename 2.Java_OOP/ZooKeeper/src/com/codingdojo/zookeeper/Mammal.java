package com.codingdojo.zookeeper; 


public class Mammal {
	
	private int energyLevel = 100;
	
	public void setEnergy(int value) {
		energyLevel = value;
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	public void adjustEnergy (int value) {
		System.out.println("energyLevel before change: " + energyLevel);
		energyLevel = energyLevel + (value);
		System.out.println("energyLevel after change: " + energyLevel);
	}

}
