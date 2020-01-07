package com.codingdojo.pokemon;
//import java.util.*;


public class Pokemon {
	
    private String 		name;
    private int 		health;
    private String 		type;
    private static int 	count = 0;
	

	public Pokemon(String name, int health, String type) {
		this.name 	= name;
		this.health = health;
		this.type 	= type;
		count++;
	}

	
    public void attackPokemon(Pokemon pokemon){
        pokemon.health -= 10;
    }
	
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}

	public static int getCount() {
		return count;
	}



}
