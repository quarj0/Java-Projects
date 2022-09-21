package myAtmProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class Transfer {

	private JFrame frmTheJGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transfer window = new Transfer();
					window.frmTheJGroup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Transfer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheJGroup = new JFrame();
		frmTheJGroup.setType(Type.POPUP);
		frmTheJGroup.setTitle("THE J GROUP ATM");
		frmTheJGroup.setResizable(false);
		frmTheJGroup.setBackground(new Color(128, 128, 128));
		frmTheJGroup.getContentPane().setBackground(new Color(0, 128, 128));
		frmTheJGroup.setBounds(100, 100, 806, 500);
		frmTheJGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheJGroup.getContentPane().setLayout(null);
		
		JPanel transferPanel = new JPanel();
		transferPanel.setBackground(Color.WHITE);
		transferPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Transfer Menu", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		transferPanel.setBounds(10, 11, 770, 439);
		frmTheJGroup.getContentPane().add(transferPanel);
		transferPanel.setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(null);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(245, 371, 101, 34);
		transferPanel.add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(transferPanel, "No action performed.");
			}
		});
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setBounds(418, 371, 101, 34);
		transferPanel.add(btnOk);
		
		JButton btnTransferTo = new JButton("To different Bank");
		btnTransferTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankSelection.main(null);
			}
		});
		btnTransferTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTransferTo.setBounds(58, 78, 200, 34);
		transferPanel.add(btnTransferTo);
		
		JButton btnTransferToMobile = new JButton("To Mobile Account");
		btnTransferToMobile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AmountMenu.main(null);
			}
		});
		btnTransferToMobile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTransferToMobile.setBounds(58, 131, 200, 34);
		transferPanel.add(btnTransferToMobile);
		
		JButton btnToFix = new JButton("To fixed Deposit ");
		btnToFix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					JOptionPane.showMessageDialog(transferPanel, "Service currently unvailabel !");
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(transferPanel, "An error occurred!\nPlease try again later.");
				}
				
//				JOptionPane.showMessageDialog(transferPanel,"Transfer succeeded!");
			}
		});
		btnToFix.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnToFix.setBounds(509, 78, 200, 34);
		transferPanel.add(btnToFix);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(null);
			}
		});
		btnBack.setBackground(new Color(0, 0, 255));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(608, 327, 101, 34);
		transferPanel.add(btnBack);
	}
}
