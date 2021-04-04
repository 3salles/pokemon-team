package view;

import dao.PokemonDAO;
import model.Pokemon;

public class Main {

    public static void main(String[] args) {
        PokemonDAO pokemonDao = new PokemonDAO();

        
		 /* Pokemon vulpix = new Pokemon(37, "Vulpix Alola","Gelo", null, 41, 40, 38,
		  65); pokemonDao.savePokemon(vulpix);
		  
		  Pokemon buizel = new Pokemon(330, "Buizel","Água", null, 65, 35, 55, 85);
		 pokemonDao.savePokemon(buizel);
		 
		 Pokemon growlithe = new Pokemon(58, "Growlithe", "Fogo", null, 70, 45, 55,
		 60); pokemonDao.savePokemon(growlithe);
		
		pokemonDao.savePokemon(squirtle);
        
        Pokemon squirtle = new Pokemon(7, "Squirtle", "Água", null, 48, 65, 44, 43); */

        // List Pokemons
        System.out.println("ID - Pokemon - HP - ATK - DEF - SPEED");

        for (Pokemon p : pokemonDao.getPokemons()) {
            System.out.printf("%d - %s - %d - %d - %d - %d\n", p.getOfficial_id(), p.getName(), p.getHp(), p.getAtk(),
                    p.getDef(), p.getSpeed());
        }

        // Delete Pokemon
        /*pokemonDao.deletePokemon(squirtle);*/

    }
}
