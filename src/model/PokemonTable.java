package model;

import dao.PokemonDAO;
import model.PokemonTableModel;

import javax.swing.*;

public class PokemonTable extends JFrame {
    public PokemonTable() {
        super("Pokemon Team");
        PokemonDAO pokeDao = new PokemonDAO();
        PokemonTableModel pokeTableModel = new PokemonTableModel(pokeDao);
        JTable pokeTable = new JTable(pokeTableModel);
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(pokeTable);
        add(scroll);
        setSize(470, 570);
    }
    
    
}
