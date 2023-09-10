package moti.components;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import moti.components.LoginPanel;

public class CoverPanel extends JPanel {
	
	private ActionListener event;
	private boolean islogin;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	/**
	 * Create the panel.
	 */
	public CoverPanel() {

		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("wrap,fill", "[center]", "push[]50[][]30[]push[]push\r\n"));
		
		lblNewLabel = new JLabel("Welcome back !");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel, "cell 0 0");
		
		lblNewLabel_1 = new JLabel("To keep connected with us please");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		add(lblNewLabel_1, "cell 0 1");
		
		lblNewLabel_2 = new JLabel("login to your personal info");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		add(lblNewLabel_2, "cell 0 2");
		
		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				event.actionPerformed(e);
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(btnNewButton, "width 30%,height 5%");

	}
	
	public void addEvent(ActionListener event) {
		this.event = event;
	}
	
	public void registertext() {
		lblNewLabel.setText("Hello friend!");
		lblNewLabel_1.setText("Create your personal details here");
		lblNewLabel_2.setText("And start journey with us");
		btnNewButton.setText("Sign in");
	}
	public void logintext() {
		lblNewLabel.setText("Welcome back !");
		lblNewLabel_1.setText("To keep connected with us please");
		lblNewLabel_2.setText("login to your personal info");
		btnNewButton.setText("register");
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setPaint(new Color(0,0,0));
	    g2.fillRect(0, 0, getWidth(), getHeight());
	}
	

}
