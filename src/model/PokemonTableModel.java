package model;

import dao.PokemonDAO;
import java.util.List;
import utils.Toggle;

import javax.swing.table.*;
import javax.swing.event.*;


public class PokemonTableModel extends AbstractTableModel implements TableModelListener {
    PokemonDAO pokeDao;
    List<Pokemon> pokemons;
    List<String> columns;
    boolean isEdit;
    Toggle editable;
    
    public PokemonTableModel (PokemonDAO  pokeDao){
        this.pokeDao = pokeDao;
        pokemons = pokeDao.getPokemons();
        columns = List.of("ID", "Nome", "Tipo 1", "Tipo 2", "Ataque", "Defesa", "Agilidade", "Vida");
        this.addTableModelListener(this);
        
    }
    
    
   public void tableChanged(TableModelEvent event){
       int index = event.getFirstRow();
       Pokemon pokemon = pokemons.get(index);
       System.out.println(index);
       pokeDao.updatePokemons(pokemon);
   }
   
   public void deletePokemon(int id) throws Exception{
       for (Pokemon poke: pokemons){
           if(poke.getOfficial_id() == id){
               pokemons.remove(poke);
               break;
           }
       }
       pokeDao.delPokemon(id);
       fireTableDataChanged();
   }
   
   
   
    @Override
    public boolean isCellEditable(int row, int col){
 
        return true;
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
