package moti.components;

import javax.swing.JPanel;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Font;
import java.awt.CardLayout;

public class LoginPanel extends JLayeredPane {
	private JTextField textField;
	private JTextField textField_1;
	private JPanel register;
	private JPanel login;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setLayout(new CardLayout(0, 0));
		login();
		register();

	}

	public void login() {
		login = new JPanel();
		add(login, "name_335805708716500");
		login.setLayout(new MigLayout("wrap", "push[center]90", "push[]30[][]20[]push[]push\r\n"));

		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		login.add(lblNewLabel, "width 40");

		textField_1 = new JTextField();
		login.add(textField_1, "width 60%,height 30");
		textField_1.setColumns(10);

		textField = new JTextField();
		login.add(textField, "width 60%,height 30");
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		login.add(btnNewButton, "width 30%,height 20");
	}
	
	public void register() {
		register = new JPanel();
		add(register, "name_335805708716500");
		register.setLayout(new MigLayout("wrap,fill\r\n", "push[center]90", "push[]30[][][][]20[]push[]push"));

		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		register.add(lblNewLabel, "cell 0 0,width 40");

		textField_1 = new JTextField();
		register.add(textField_1, "cell 0 1,width 60%,height 30");
		textField_1.setColumns(10);

		textField = new JTextField();
		register.add(textField, "cell 0 2,width 60%,height 30");
		textField.setColumns(10);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				register.add(textField_2, "width 60%,height 30");
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				register.add(textField_3, "width 60%,height 30");
		
				JButton btnNewButton = new JButton("Register");
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setBackground(Color.BLACK);
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
				register.add(btnNewButton, "cell 0 5,width 30%,height 20");
	}
	
	public void showregister(boolean show) {
		if(show) {
			register.setVisible(true);
			login.setVisible(false);
		}else {
			register.setVisible(false);
			login.setVisible(true);
		}
	}

}
