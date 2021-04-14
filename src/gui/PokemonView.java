package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import model.PokemonTableModel;
import dao.PokemonDAO;


public class PokemonView extends JFrame{
    
    private JLabel titleLabel;
    private JTable pokeTable;
    private JScrollPane scroll;
    private JButton  registerButton, editButton, saveButton, deleteButton;
    
    public PokemonView(){
        initComponents();
    }
    
    private void initComponents(){
        setTitle("Pokemons");
        setSize(470, 570);
        
        titleLabel = new JLabel("POKEMONS");
        titleLabel.setFont(new Font("Liberation Sans", 1, 18));
        
        // Close config

        addWindowListener (new WindowAdapter () {
            public void windowClosing(WindowEvent e){
                int choose = JOptionPane.showConfirmDialog(null, 
                        "Deseja realmente sair?", "Sair - Confirmação", 
                        JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (choose == JOptionPane.YES_OPTION){
                     System.exit(1);
                 }
            }
        });
        
             
        // Create Table
        PokemonDAO pokeDao = new PokemonDAO();
        PokemonTableModel pokeTableModel = new PokemonTableModel(pokeDao);
        
        pokeTable = new JTable(pokeTableModel);
        scroll = new JScrollPane();
        scroll.setViewportView(pokeTable);
        //add(scroll);
        
        // Create Button
        registerButton = new JButton("Cadastrar");
        registerButton.setBackground(new java.awt.Color(0, 255, 255));
        
        editButton = new JButton("Editar");
        editButton.setBackground(new java.awt.Color(255, 153, 0));
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        
        deleteButton = new JButton("Deletar");
        deleteButton.setBackground(new Color(255, 0, 0));
        deleteButton.setForeground(new Color(255, 255, 255));
        
        saveButton = new JButton("Salvar");
        saveButton.setBackground(new Color(0, 255, 0));
        saveButton.setForeground(new Color(255, 255, 255));
        
        // Layout
        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerButton)
                                .addGap(79, 79, 79)
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton)
                                .addGap(69, 69, 69)
                                .addComponent(saveButton))
                            .addComponent(scroll, GroupLayout.PREFERRED_SIZE, 549,GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addGap(26, 26, 26)
                .addComponent(scroll, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
               
    }
    
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                new PokemonView().setVisible(true);
            }
        }); 
    }
}
