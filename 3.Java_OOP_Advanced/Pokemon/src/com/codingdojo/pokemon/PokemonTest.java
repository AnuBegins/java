package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		
        Pokedex pokedex = new Pokedex();
        
        Pokemon p1 = pokedex.createPokemon("Blastoise", 300, "Water");
//        System.out.println(pokedex.pokemonInfo(p1));
//        System.out.println("\n");

        Pokemon p2 = pokedex.createPokemon("Pikachu", 200, "Electricity");
//        System.out.println(pokedex.pokemonInfo(p2));
//        System.out.println("\n");

        Pokemon p3 = pokedex.createPokemon("Charizard", 400, "Fire");
//        System.out.println(pokedex.pokemonInfo(p3));
//        System.out.println("\n");
        
        p3.attackPokemon(p2);
        System.out.println(pokedex.pokemonInfo(p2));
        
        pokedex.listPokemon();
	}

}
