package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		
		Human dude1 = new Human();
		Human dude2 = new Human();
		
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();

		System.out.println("\n Ninja's health is :"+ninja.getHealth());
		System.out.println("\n Wizard's health is :"+wizard.getHealth());
		System.out.println("\n Counter value is "+Human.counter);
		
		System.out.println("\n dude1 attacked dude2 !");
		dude1.attack(dude2);
		
		System.out.println("\n dude1 attacked dude2 !");
		dude1.attack(dude2);
		
		System.out.println("\n dude2 attacked dude1 !");
		dude2.attack(dude1);
		
	}
}
