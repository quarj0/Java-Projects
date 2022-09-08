package myAtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame frmJGroupAtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
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
		frmJGroupAtm.setBounds(100, 100, 700, 500);
		frmJGroupAtm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJGroupAtm.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Main Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(10, 11, 664, 439);
		frmJGroupAtm.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Verification.main(null);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(200, 366, 101, 34);
		mainPanel.add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnOk, "No selection performed");
			}
		});
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setBounds(373, 366, 101, 34);
		mainPanel.add(btnOk);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnBack, "Use CANCEL button to go back");
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBackground(Color.BLUE);
		btnBack.setBounds(532, 301, 101, 34);
		mainPanel.add(btnBack);
		
		JButton btnCheck = new JButton("Check Balance");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckBalance.main(null);
			}
		});
		btnCheck.setForeground(new Color(255, 255, 255));
		btnCheck.setBackground(new Color(30, 144, 255));
		btnCheck.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCheck.setBounds(40, 63, 152, 34);
		mainPanel.add(btnCheck);
		
		JButton btnWithdraw = new JButton("Withdrawal");
		btnWithdraw.setForeground(new Color(255, 255, 255));
		btnWithdraw.setBackground(new Color(30, 144, 255));
		btnWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnWithdraw.setBounds(40, 126, 152, 36);
		mainPanel.add(btnWithdraw);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.setForeground(new Color(255, 255, 255));
		btnTransfer.setBackground(new Color(30, 144, 255));
		btnTransfer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTransfer.setBounds(40, 196, 152, 38);
		mainPanel.add(btnTransfer);
		
		JButton btnCardless = new JButton("Cardless Withdrawal");
		btnCardless.setForeground(new Color(255, 255, 255));
		btnCardless.setBackground(new Color(30, 144, 255));
		btnCardless.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCardless.setBounds(422, 196, 197, 36);
		mainPanel.add(btnCardless);
		
		JButton btnMini = new JButton("Mini Statement");
		btnMini.setForeground(new Color(255, 255, 255));
		btnMini.setBackground(new Color(30, 144, 255));
		btnMini.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMini.setBounds(461, 63, 158, 34);
		mainPanel.add(btnMini);
		
		JButton btnStatement = new JButton("Statement");
		btnStatement.setForeground(new Color(255, 255, 255));
		btnStatement.setBackground(new Color(30, 144, 255));
		btnStatement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStatement.setBounds(461, 126, 158, 36);
		mainPanel.add(btnStatement);
	}
}
