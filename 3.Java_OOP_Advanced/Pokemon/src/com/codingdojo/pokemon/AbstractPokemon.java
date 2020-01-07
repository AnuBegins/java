package com.codingdojo.pokemon;

import java.util.*;

public abstract class AbstractPokemon implements PokemonInterface {
	
    ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();

		
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name, health, type);
        myPokemons.add(pokemon);
        return pokemon;
    }
    
    
    public String pokemonInfo(Pokemon pokemon){
    
        String pokeInfo =  String.format("Name: %s | Health: %d | Type: %s", pokemon.getName(), pokemon.getHealth(), pokemon.getType());
     //   System.out.print(pokeInfo);
        return pokeInfo;
        
    }
    
}


