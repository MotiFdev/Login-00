package moti.main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;
import moti.components.*;
import net.miginfocom.swing.MigLayout;
public class main extends JFrame {
	private LoginPanel loginPanel;
	private CoverPanel cover;
	private JLayeredPane contentPane;
	private boolean clicked;
	private int click = 0;
	private boolean islogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		loginPanel = new LoginPanel();
		cover = new CoverPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 464);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("fill, insets -10", "[109px]", "[201px]"));
		contentPane.add(cover, "pos 0al -5 null 120%,cell 0 0,width 35%");
		contentPane.add(loginPanel, "pos 1al -5 null 120%,cell 0 0,width 75%");
		cover.addEvent(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(click == 0) {
					click = 1;
					islogin = true;
					cover.registertext();
				}else {
					click = 0;
					islogin = false;
					cover.logintext();
				}
				
				loginPanel.showregister(islogin);
				

				
			}
		});
	}

}
