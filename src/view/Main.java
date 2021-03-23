package view;

import dao.PokemonDAO;
import model.Pokemon;

public class Main {
	 public static void main(String[] args) {
		 PokemonDAO pokemonDao = new PokemonDAO();
		 
		 
		 Pokemon vulpix = new Pokemon(37, "Vulpix Alola","Gelo", null, 41, 40, 38, 65);
		 pokemonDao.savePokemon(vulpix);
		
		 Pokemon buizel = new Pokemon(330, "Buizel","Água", null, 65, 35, 55, 85);
		 pokemonDao.savePokemon(buizel);
		 
		 Pokemon growlithe = new Pokemon(58, "Growlithe", "Fogo", null, 70, 45, 55, 60);
		 pokemonDao.savePokemon(growlithe);
		 
		 
	}
}
