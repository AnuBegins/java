package com.codingdojo.pokemon;

import java.util.*;

@SuppressWarnings("unused")
public class Pokedex extends AbstractPokemon {
	
	@Override
	public void listPokemon() {
        System.out.println("List of all Pokemon in the Pokedex");
        
        for(Pokemon pokemon: myPokemons) {
        	String poke = pokemonInfo(pokemon);
        	System.out.println(poke);
        }	
	}
}
