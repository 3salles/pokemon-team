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

	public List<Pokemon> getPokemons() {

		String sql = "SELECT * FROM pokemons ORDER BY official_id";

		List<Pokemon> pokemons = new ArrayList<Pokemon>();

		Connection connection = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			connection = JdbcConnection.getConnection();

			pstm = connection.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Pokemon pokemon = new Pokemon();

				pokemon.setOfficial_id(rset.getInt("official_id"));
				pokemon.setName(rset.getString("name"));
				pokemon.setPrimary_type(rset.getString("primary_type"));
				pokemon.setSecond_type(rset.getString("second_type"));
				pokemon.setAtk(rset.getInt("atk"));
				pokemon.setDef(rset.getInt("def"));
				pokemon.setHp(rset.getInt("hp"));
				pokemon.setSpeed(rset.getInt("speed"));

				pokemons.add(pokemon);

			}
		} catch (Exception exception) {
			exception.printStackTrace();

		} finally {
			try {
				if (rset != null) {
					rset.close();
				}

				if (pstm != null) {
					pstm.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception exception) {
				exception.printStackTrace();

			}
		}

		return pokemons;

	}
	
	
	public void deletePokemon(Pokemon pokemon) {
		String sql = "DELETE FROM pokemons WHERE official_id = ?";
		
		Connection connection = null;
		PreparedStatement pstm = null;
		
		try {
			connection = JdbcConnection.getConnection();
			pstm = connection.prepareStatement(sql);
			
			pstm.setInt(1, pokemon.getOfficial_id());
			
			pstm.execute();
			
			String pokemonName = pokemon.getName();
			
			System.out.printf("%s deletado com sucesso!\n", pokemonName);
			
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
