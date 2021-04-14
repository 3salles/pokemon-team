package gui;

import gui.RegisterView;
import model.PokemonTable;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Home extends JFrame {

    private JButton listButton;
    private JButton registerButton;
    private JLabel titleLabel;

    public Home() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Home");
        
        titleLabel = new JLabel("POKEMON TEAM");
        titleLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18));
        
        registerButton = new JButton("Cadastrar");
        listButton = new JButton("Listar");

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
        

        // Buttons Events

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        listButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });
        
        
        // Group Layout Config
        
        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(registerButton)
                        .addGap(83, 83, 83)
                        .addComponent(listButton)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLabel)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(listButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }

    private void registerButtonActionPerformed(ActionEvent evt) {                                               
        RegisterView registerFrame = new RegisterView();
        registerFrame.setVisible(true);
        dispose();
    }

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        PokemonTable pokeFrame = new PokemonTable();
        pokeFrame.setVisible(true);
        dispose();
    }


    public static void main(String args[]) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

}
