package myAtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Font;

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
		frmTheJGroup.setBounds(100, 100, 700, 500);
		frmTheJGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheJGroup.getContentPane().setLayout(null);
		
		JPanel transferPanel = new JPanel();
		transferPanel.setBackground(Color.WHITE);
		transferPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Transfer Menu", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		transferPanel.setBounds(10, 11, 664, 439);
		frmTheJGroup.getContentPane().add(transferPanel);
		transferPanel.setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(215, 394, 101, 34);
		transferPanel.add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setBounds(372, 394, 101, 34);
		transferPanel.add(btnOk);
		
		JButton btnTransferTo = new JButton("To different Bank");
		btnTransferTo.setBounds(95, 78, 154, 34);
		transferPanel.add(btnTransferTo);
		
		JButton btnTransferToMobile = new JButton("To Mobile Account");
		btnTransferToMobile.setBounds(95, 131, 154, 34);
		transferPanel.add(btnTransferToMobile);
		
		JButton btnTransfer = new JButton("");
		btnTransfer.setBounds(95, 191, 154, 34);
		transferPanel.add(btnTransfer);
		
		JButton btnToFix = new JButton("To fixed Deposit Account");
		btnToFix.setBounds(449, 78, 154, 34);
		transferPanel.add(btnToFix);
		
		JButton btnToSaving = new JButton("New button");
		btnToSaving.setBounds(449, 131, 154, 34);
		transferPanel.add(btnToSaving);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(449, 191, 154, 34);
		transferPanel.add(btnNewButton_8);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 255));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(502, 315, 101, 34);
		transferPanel.add(btnBack);
	}
}
