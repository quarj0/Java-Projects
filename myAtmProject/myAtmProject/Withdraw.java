package myAtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Withdraw {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw window = new Withdraw();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Withdraw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setResizable(false);
		frame.setBounds(100, 100, 806, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(10, 11, 770, 439);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSavings = new JButton("Savings Account");
		btnSavings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoneyMenu.main(null);
			}
		});
		btnSavings.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSavings.setBounds(560, 72, 174, 32);
		panel.add(btnSavings);
		
		JButton btnCurrent = new JButton("Current Account");
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoneyMenu.main(null);
			}
		});
		btnCurrent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCurrent.setBounds(560, 132, 174, 32);
		panel.add(btnCurrent);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(null);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(270, 367, 101, 34);
		panel.add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setBounds(435, 367, 101, 34);
		panel.add(btnOk);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(null);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBackground(Color.BLUE);
		btnBack.setBounds(633, 289, 101, 34);
		panel.add(btnBack);
	}
}
