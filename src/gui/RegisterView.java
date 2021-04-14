package gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import model.Pokemon;
import dao.PokemonDAO;
import gui.Home;




public class RegisterView extends JFrame {
    
    private JLabel atkLabel;
    private JTextField atkTextField;
    private JButton cancelButton;
    private JButton cleanButton;
    private JLabel defLabel;
    private JTextField defTextField;
    private JLabel idLabel;
    private JTextField idTextField;
    private JLabel titleLabel;
    private JLabel lifeLabel;
    private JTextField lifeTextField;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JComboBox<String> primTypeComboBox;
    private JLabel primTypeLabel;
    private JPanel registerPanel;
    private JButton saveButton;
    private JComboBox<String> secTypeComboBox;
    private JLabel secTypeLabel;
    private JLabel spdLabel;
    private JTextField spdTextField;
    
    public RegisterView() {
        initComponents();
    }

    
    private void initComponents() {
        // Create Register Panel
        registerPanel = new JPanel();

        // Create Labels
        idLabel = new JLabel("ID:");
        nameLabel = new JLabel("Nome:");
        primTypeLabel = new JLabel("Tipo 1:");
        secTypeLabel = new JLabel("Tipo 2:");
        atkLabel = new JLabel("Ataque:");
        defLabel = new JLabel("Defesa:");
        spdLabel = new JLabel("Agilidade:");       
        lifeLabel = new JLabel("Vida:");


        // Text fields        
        idTextField = new JTextField();
        atkTextField = new JTextField();
        spdTextField = new JTextField();
        nameTextField = new JTextField();
        defTextField = new JTextField();
        lifeTextField = new JTextField();

        //Combo Box
        primTypeComboBox = new JComboBox<>();
        secTypeComboBox = new JComboBox<>();

        // Buttons
        cancelButton = new JButton("Cancelar");
        cleanButton = new JButton("Limpar");
        saveButton = new JButton("Salvar");
        
        titleLabel = new JLabel("Cadastro de Pokemon");
        titleLabel.setFont(new Font("Liberation Sans", 1, 18));
        

        // Close config

        addWindowListener (new WindowAdapter () {
            public void windowClosing(WindowEvent e){
                int choose = JOptionPane.showConfirmDialog(null, 
                        "Deseja realmente sair?", "Sair - Confirmação", 
                        JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (choose == JOptionPane.YES_OPTION){
<<<<<<< HEAD
                    System.exit(1);
                 }
            }
        });
=======
                     System.exit(1);
                 }
            }
        });
        
>>>>>>> release/2.5
        setTitle("Pokemon Team");
        
        // Panel title
        registerPanel.setBorder(BorderFactory.createTitledBorder("Novo Pokemon"));

        
        // TextField Events
        idTextField.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        nameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        defTextField.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defTextFieldActionPerformed(evt);
            }
        });

        lifeTextField.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifeTextFieldActionPerformed(evt);
            }
        });
        
        // Buttons events
        cleanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });
        saveButton.setBackground(new Color(0, 255, 0));
        saveButton.setForeground(new Color(255, 255, 255));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        
        cancelButton.setBackground(new Color(255, 0, 0));
        cancelButton.setForeground(new Color(255, 255, 255));
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        // Combo box events
        primTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Água", "Dragão", "Elétrico", "Fada", "Fantasma", "Fogo", "Gelo", "Inseto", "Lutador", "Metálico", "Normal", "Noturno", "Planta", "Pedra", "Psíquico", "Terra", "Venenoso", "Voador" }));
        primTypeComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                primTypeComboBoxActionPerformed(evt);
            }
        });

        secTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "-", "Água", "Dragão", "Elétrico", "Fada", "Fantasma", "Fogo", "Gelo", "Inseto", "Lutador", "Metálico", "Normal", "Noturno", "Planta", "Pedra", "Psíquico", "Terra", "Venenoso", "Voador" }));

        // Layout
        GroupLayout registerPanelLayout = new GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(spdLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spdTextField))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(atkLabel)
                            .addComponent(primTypeLabel)
                            .addComponent(idLabel))
                        .addGap(25, 25, 25)
                        .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addComponent(atkTextField, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                            .addComponent(primTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(defLabel)
                    .addComponent(secTypeLabel)
                    .addComponent(nameLabel)
                    .addComponent(lifeLabel))
                .addGap(31, 31, 31)
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lifeTextField, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(defTextField, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                    .addComponent(secTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(cleanButton)
                .addGap(94, 94, 94)
                .addComponent(saveButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(nameLabel)
                    .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(primTypeLabel)
                    .addComponent(secTypeLabel)
                    .addComponent(primTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(secTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(atkLabel)
                    .addComponent(defLabel)
                    .addComponent(atkTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(defTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lifeLabel)
                    .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(spdLabel)
                        .addComponent(spdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lifeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanButton)
                    .addComponent(saveButton))
                .addGap(16, 16, 16))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(registerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(titleLabel)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }

    private void cleanButtonActionPerformed(ActionEvent evt) {                                            
        idTextField.setText("");
        nameTextField.setText("");
        atkTextField.setText("");
        defTextField.setText("");
        spdTextField.setText("");
        lifeTextField.setText("");
    }

    private void idTextFieldActionPerformed(ActionEvent evt) {                                            

    }

    private void lifeTextFieldActionPerformed(ActionEvent evt) {                                              

    }

    private void defTextFieldActionPerformed(ActionEvent evt) {                                             

    }
    private void nameTextFieldActionPerformed(ActionEvent evt) {                                              

    }

    private void saveButtonActionPerformed(ActionEvent evt) {                                           
        String id, name, primType, secType, atk, def, hp, speed;
        id = idTextField.getText();
        name = nameTextField.getText();
        primType = primTypeComboBox.getSelectedItem().toString();
        secType = secTypeComboBox.getSelectedItem().toString();
        atk = atkTextField.getText();
        def = defTextField.getText();
        hp = lifeTextField.getText();
        speed = spdTextField.getText();

        // Check empty fields
        boolean fields = (id.isEmpty()) || (name.isEmpty())
                || (atk.isEmpty()) || (speed.isEmpty())
                || (def.isEmpty()) || (hp.isEmpty());
                

        if (fields) {
            JOptionPane.showMessageDialog(this, "Os campos id, nome, ataque, defesa, vida e velocidade precisam ser preenchidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {

            // Create pokemon instance
            Pokemon pokemon = new Pokemon();
            pokemon.setOfficial_id(Integer.parseInt(id));
            pokemon.setName(name);
            pokemon.setPrimary_type(primType);
            pokemon.setSecond_type(secType);
            pokemon.setAtk(Integer.parseInt(atk));
            pokemon.setDef(Integer.parseInt(def));
            pokemon.setHp(Integer.parseInt(hp));
            pokemon.setSpeed(Integer.parseInt(speed));
            
            
            // Save in DB

            PokemonDAO pokemonDao = new PokemonDAO();
            pokemonDao.savePokemon(pokemon);
            
            JOptionPane.showMessageDialog(null, "Pokemon " + nameTextField.getText() + " cadastrado com sucesso!");

            // Clean fields 
            idTextField.setText("");
            nameTextField.setText("");
            atkTextField.setText("");
            defTextField.setText("");
            spdTextField.setText("");
            lifeTextField.setText("");
            
        }

    }

    private void cancelButtonActionPerformed(ActionEvent evt) {                                             
        Home homeFrame = new Home();
        homeFrame.setVisible(true);
        dispose();
    }
    private void primTypeComboBoxActionPerformed(ActionEvent evt) {                                                 
    }


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);

            }
        });
    }
     
}