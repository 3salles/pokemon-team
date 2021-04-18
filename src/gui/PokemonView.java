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
    private JButton  registerButton, deleteButton;

    
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
        
                
        deleteButton = new JButton("Deletar");
        deleteButton.setBackground(new Color(255, 0, 0));
        deleteButton.setForeground(new Color(255, 255, 255));
        
         
        // Buttons Events

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        
                
        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(registerButton)
                        .addGap(69, 69, 69)
                        .addComponent(deleteButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(deleteButton))
                .addGap(51, 51, 51))
        );

        pack();
               
    }
    private void registerButtonActionPerformed(ActionEvent evt) {                                            
        RegisterView registerFrame = new RegisterView();
        registerFrame.setVisible(true);
        dispose();
    }
    
    private void deleteButtonActionPerformed(ActionEvent evt) {                                            
        int id = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do Pokemon:"));
        PokemonDAO pokeDao = new PokemonDAO();
        PokemonTableModel pokeTableModel = new PokemonTableModel(pokeDao);
         
       
        try {
            pokeTableModel.deletePokemon(id);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, "Não existe pokemon com este ID!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }

    
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                new PokemonView().setVisible(true);
            }
        }); 
    }
}
