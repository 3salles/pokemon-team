package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.JdbcConnection;
import model.Pokemon;

public class PokemonDAO {
	
	public void savePokemon(Pokemon pokemon) {
		
		String sql = "INSERT INTO pokemons(official_id, name, primary_type, second_type, atk, def, hp, speed) VALUES (?,?,?,?,?,?,?,?)";
		
		
		Connection connection = null;
		PreparedStatement pstm = null;
		
		try {
			//Create connection to db
			connection = JdbcConnection.getConnection();
			
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, pokemon.getOfficial_id());
			pstm.setString(2, pokemon.getName());
			pstm.setString(3, pokemon.getPrimary_type());
			pstm.setString(4, pokemon.getSecond_type());
			pstm.setInt(5, pokemon.getAtk());
			pstm.setInt(6, pokemon.getDef());
			pstm.setInt(7, pokemon.getHp());
			pstm.setInt(8, pokemon.getSpeed());
			
			//Execute query
			pstm.execute();
			
			String pokemonName = pokemon.getName();
			
			System.out.printf("%s adicionado com sucesso!\n", pokemonName);
			
		} catch (Exception exception){
			exception.printStackTrace();
		} finally {
			
			//Close all connections
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(connection !=null) {
					connection.close();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	
	
}
