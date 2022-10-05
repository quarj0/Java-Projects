package myAtmProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckBalance {

	private JFrame frmJGroupAtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBalance window = new CheckBalance();
					window.frmJGroupAtm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckBalance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJGroupAtm = new JFrame();
		frmJGroupAtm.getContentPane().setBackground(new Color(0, 128, 128));
		frmJGroupAtm.setTitle("J GROUP ATM");
		frmJGroupAtm.setResizable(false);
		frmJGroupAtm.setBounds(100, 100, 806, 500);
		frmJGroupAtm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJGroupAtm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 770, 439);
		frmJGroupAtm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(null);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(256, 362, 101, 34);
		panel.add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setBounds(405, 362, 101, 34);
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
		btnBack.setBounds(621, 321, 101, 34);
		panel.add(btnBack);
		
		JButton btnSavings = new JButton("Savings Account");
		btnSavings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "Your balance is Gh¢500.00");
			}
		});
		btnSavings.setBounds(31, 139, 176, 34);
		panel.add(btnSavings);
		btnSavings.setForeground(new Color(255, 255, 255));
		btnSavings.setBackground(new Color(47, 79, 79));
		btnSavings.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnCurrent = new JButton("Current Account");
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "Your balance is Gh¢1200.00");
			}
		});
		btnCurrent.setForeground(Color.WHITE);
		btnCurrent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCurrent.setBackground(new Color(47, 79, 79));
		btnCurrent.setBounds(31, 77, 176, 34);
		panel.add(btnCurrent);
		
		JButton btnFixedDepositAccount = new JButton("Fixed Deposit Account");
		btnFixedDepositAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "Your balance is Gh¢3500.00");
			}
		});
		btnFixedDepositAccount.setForeground(Color.WHITE);
		btnFixedDepositAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFixedDepositAccount.setBackground(new Color(47, 79, 79));
		btnFixedDepositAccount.setBounds(515, 77, 207, 34);
		panel.add(btnFixedDepositAccount);
	}

}
