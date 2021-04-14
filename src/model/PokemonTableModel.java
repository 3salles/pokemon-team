package model;

import dao.PokemonDAO;
import javax.swing.table.AbstractTableModel;
import java.util.List;


public class PokemonTableModel extends AbstractTableModel {
    PokemonDAO pokeDao;
    List<Pokemon> pokemons;
    List<String> columns;
    
    public PokemonTableModel (PokemonDAO  pokeDao){
        this.pokeDao = pokeDao;
        pokemons = pokeDao.getPokemons();
        columns = List.of("ID", "Nome", "Tipo 1", "Tipo 2", "Ataque", "Defesa", "Agilidade", "Vida");
        
    }
    
    @Override
    public int getRowCount(){
        return pokemons.size();
    }
    
    @Override
    public int getColumnCount(){
        return columns.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Pokemon pokemon = pokemons.get(rowIndex);
        
        switch (columnIndex){
            case 0: return pokemon.getOfficial_id();
            case 1: return pokemon.getName();
            case 2: return pokemon.getPrimary_type();
            case 3: return pokemon.getSecond_type();
            case 4: return pokemon.getAtk();
            case 5: return pokemon.getDef();
            case 6: return pokemon.getSpeed();
            case 7: return pokemon.getHp();
            default: return null;
        }
        
    }
    
    @Override
    public String getColumnName(int column){
        return columns.get(column);
    }
}
