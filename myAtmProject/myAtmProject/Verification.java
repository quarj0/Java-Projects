package myAtmProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;


public class Verification {

	private JFrame frmJGroupAtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Verification window = new Verification();
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
	public Verification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJGroupAtm = new JFrame();
		frmJGroupAtm.setTitle("J GROUP ATM");
		frmJGroupAtm.setResizable(false);
		frmJGroupAtm.setBackground(new Color(128, 128, 128));
		frmJGroupAtm.getContentPane().setBackground(new Color(0, 128, 128));
		frmJGroupAtm.setBounds(100, 100, 806, 500);
		frmJGroupAtm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJGroupAtm.getContentPane().setLayout(null);
		
		JPanel verifyPAnel = new JPanel();
		verifyPAnel.setBackground(new Color(255, 255, 255));
		verifyPAnel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Verification", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		verifyPAnel.setBounds(10, 11, 770, 439);
		frmJGroupAtm.getContentPane().add(verifyPAnel);
		verifyPAnel.setLayout(null);
		
		JButton btnVerify = new JButton("");
		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnVerify, "Verification successful");
				MainMenu.main(null);
			}
		});
		btnVerify.setIcon(new ImageIcon(Verification.class.getResource("/image/fingerprint.gif")));
		btnVerify.setBounds(248, 97, 285, 294);
		verifyPAnel.add(btnVerify);
		
		JLabel txtVerify = new JLabel("Please verify your account!");
		txtVerify.setHorizontalAlignment(SwingConstants.CENTER);
		txtVerify.setForeground(new Color(255, 0, 0));
		txtVerify.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtVerify.setBounds(294, 36, 215, 22);
		verifyPAnel.add(txtVerify);
	}
}
