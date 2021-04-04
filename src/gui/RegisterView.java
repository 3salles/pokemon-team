package gui;

import javax.swing.*;

public class RegisterView extends JFrame {
	// Variables declaration
	private JLabel atkLabel;
	private JTextField atkTextField;
	private JButton cancelButton;
	private JLabel defLabel;
	private JTextField defTextField;
	private JLabel hpLabel;
	private JTextField hpTextField;
	private JLabel idLabel;
	private JTextField idTextField;
	private JPanel registerPanel;
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel registerLabel;
	private JButton saveButton;
	private JLabel spdLabel;
	private JTextField spdTextField;
	// End of variables declaration

	/**
	 * Creates new form RegisterView
	 */
	public RegisterView() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		setTitle("Pokemon Team");

		// Panel
		registerPanel = new JPanel();

		// Labels
		registerLabel = new JLabel();

		idLabel = new JLabel();
		idLabel.setText("ID Oficial:");

		atkLabel = new JLabel();
		atkLabel.setText("Ataque (ATK):");

		hpLabel = new JLabel();
		hpLabel.setText("Vida (HP):");

		nameLabel = new JLabel();
		nameLabel.setText("Nome :");

		defLabel = new JLabel();
		defLabel.setText("Defesa (DEF):");

		spdLabel = new JLabel();
		spdLabel.setText("Speed (SPD):");

		// TextFields
		idTextField = new JTextField();
		nameTextField = new JTextField();
		atkTextField = new JTextField();
		defTextField = new JTextField();
		hpTextField = new JTextField();
		spdTextField = new JTextField();

		// Buttons
		cancelButton = new JButton();
		saveButton = new JButton();

		// Exit whit close button
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// Screen Name Label
		registerLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18));
		registerLabel.setText("Cadastro de Pokemon");

		// Creating Panel Name
		registerPanel.setBorder(BorderFactory.createTitledBorder("Novo Pokemon"));

		// Creating Panel Layout
		GroupLayout registerPanelLayout = new GroupLayout(registerPanel);
		registerPanel.setLayout(registerPanelLayout);

		// Labels Layout
		registerPanelLayout.setHorizontalGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(registerPanelLayout.createSequentialGroup().addGap(47, 47, 47)
						.addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(registerPanelLayout.createSequentialGroup().addComponent(hpLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(hpTextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(registerPanelLayout.createSequentialGroup().addComponent(idLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(registerPanelLayout.createSequentialGroup().addComponent(atkLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(atkTextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
						.addGap(120, 120, 120)
						.addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(registerPanelLayout.createSequentialGroup().addComponent(spdLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(spdTextField))
								.addGroup(registerPanelLayout.createSequentialGroup().addComponent(defLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(defTextField, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
								.addGroup(registerPanelLayout.createSequentialGroup().addComponent(nameLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(28, Short.MAX_VALUE)));

		// TextFields Layouts
		registerPanelLayout
				.setVerticalGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(registerPanelLayout.createSequentialGroup().addGap(19, 19, 19)
								.addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(idLabel)
										.addComponent(nameLabel)
										.addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(25, 25, 25)
								.addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(atkLabel)
										.addComponent(defLabel)
										.addComponent(atkTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(defTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(registerPanelLayout.createSequentialGroup().addGap(24, 24, 24)
												.addGroup(registerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
														.addComponent(hpLabel)
														.addComponent(hpTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(spdLabel)))
										.addGroup(registerPanelLayout.createSequentialGroup().addGap(18, 18, 18).addComponent(spdTextField,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(17, Short.MAX_VALUE)));

		// Buttons
		cancelButton.setBackground(new java.awt.Color(255, 0, 0));
		cancelButton.setForeground(new java.awt.Color(255, 255, 255));
		cancelButton.setText("Cancelar");

		// Cancel Button Listener
		cancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelButtonActionPerformed(evt);
			}
		});

		saveButton.setBackground(new java.awt.Color(0, 255, 0));
		saveButton.setForeground(new java.awt.Color(0, 0, 0));

		// Save Button Listener
		saveButton.setText("Salvar");

		// Button Layout

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(registerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(registerLabel).addGap(232, 232, 232))
				.addGroup(layout.createSequentialGroup().addGap(142, 142, 142).addComponent(cancelButton).addGap(110, 110, 110)
						.addComponent(saveButton).addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(16, Short.MAX_VALUE).addComponent(registerLabel)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(registerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(cancelButton).addComponent(saveButton))
								.addGap(26, 26, 26)));

		pack();
	}

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cancelButtonActionPerformed

	/**
	 * @param args the command line arguments
	 */
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

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegisterView().setVisible(true);
			}
		});
	}

}
