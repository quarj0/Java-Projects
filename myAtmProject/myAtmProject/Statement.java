package myAtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;

public class Statement {

	private JFrame frmSdgdgd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statement window = new Statement();
					window.frmSdgdgd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Statement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSdgdgd = new JFrame();
		frmSdgdgd.getContentPane().setBackground(new Color(0, 128, 128));
		frmSdgdgd.setResizable(false);
		frmSdgdgd.setBounds(100, 100, 806, 500);
		frmSdgdgd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSdgdgd.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Statement", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(10, 11, 770, 439);
		frmSdgdgd.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBackground(Color.BLUE);
		btnBack.setBounds(646, 394, 101, 34);
		panel.add(btnBack);
	}
}
