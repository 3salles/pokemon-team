package gui;

import javax.swing.*;
import model.Pokemon;
import dao.PokemonDAO;


public class RegisterView extends JFrame {
    
    public RegisterView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {
        // Create Register Panel
        registerPanel = new JPanel();

        // Create Labels
        idLabel = new JLabel();
        idLabel.setText("ID:");
        nameLabel = new JLabel();
        nameLabel.setText("Nome:");
        primTypeLabel = new JLabel();
        primTypeLabel.setText("Tipo 1:");
        secTypeLabel = new JLabel();
        secTypeLabel.setText("Tipo 2:");
        atkLabel = new JLabel();
        atkLabel.setText("Ataque:");
        defLabel = new JLabel();
        defLabel.setText("Defesa:");
        spdLabel = new JLabel();
        spdLabel.setText("Agilidade:");        
        lifeLabel = new JLabel();
        lifeLabel.setText("Vida:");

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
        cancelButton = new JButton();
        cleanButton = new JButton();
        saveButton = new JButton();
        
        jLabel1 = new JLabel();
        

        // Close config

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokemon Team");
        
        // Panel title
        registerPanel.setBorder(BorderFactory.createTitledBorder("Novo Pokemon"));

        
        // TextField Events
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        defTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defTextFieldActionPerformed(evt);
            }
        });

        lifeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifeTextFieldActionPerformed(evt);
            }
        });
        
        // Buttons events
        cleanButton.setText("Limpar");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });
        saveButton.setBackground(new java.awt.Color(0, 255, 0));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        // Combo box events
        primTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Água", "Dragão", "Elétrico", "Fada", "Fantasma", "Fogo", "Gelo", "Inseto", "Lutador", "Metálico", "Normal", "Noturno", "Planta", "Pedra", "Psíquico", "Terra", "Venenoso", "Voador" }));
        primTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Pokemon");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cancelButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        idTextField.setText("");
        nameTextField.setText("");
        atkTextField.setText("");
        defTextField.setText("");
        spdTextField.setText("");
        lifeTextField.setText("");
    }

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }

    private void lifeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }

    private void defTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             

    }
    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
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

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ListView listView = new ListView();
        listView.setVisible(true);
        dispose();
    }
    private void primTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }


    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);

            }
        });
    }
     private JLabel atkLabel;
    private JTextField atkTextField;
    private JButton cancelButton;
    private JButton cleanButton;
    private JLabel defLabel;
    private JTextField defTextField;
    private JLabel idLabel;
    private JTextField idTextField;
    private JLabel jLabel1;
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
}
