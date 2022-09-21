package myAtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoneyMenu {

	private JFrame frame;
	private JTextField txtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoneyMenu window = new MoneyMenu();
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
	public MoneyMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 806, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(10, 11, 770, 439);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn20 = new JButton("20");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "You have successfully withdraw Gh¢20.0");
			}
		});
		btn20.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn20.setBounds(83, 107, 89, 33);
		panel.add(btn20);
		
		JButton btn50 = new JButton("50");
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "You have successfully withdraw Gh¢50.0");
			}
		});
		btn50.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn50.setBounds(83, 169, 89, 33);
		panel.add(btn50);
		
		JButton btn100 = new JButton("100");
		btn100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "You have successfully withdraw Gh¢100.0");
			}
		});
		btn100.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn100.setBounds(83, 225, 89, 33);
		panel.add(btn100);
		
		JButton btn500 = new JButton("500");
		btn500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "You have successfully withdraw Gh¢500.0");
			}
		});
		btn500.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn500.setBounds(594, 107, 89, 33);
		panel.add(btn500);
		
		JButton btn1000 = new JButton("1000");
		btn1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "You have successfully withdraw Gh¢1000.0");
			}
		});
		btn1000.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn1000.setBounds(594, 169, 89, 33);
		panel.add(btn1000);
		
		JButton btn2000 = new JButton("2000");
		btn2000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "You have successfully withdraw Gh¢2000.0");
			}
		});
		btn2000.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn2000.setBounds(594, 225, 89, 33);
		panel.add(btn2000);
		
		txtInput = new JTextField();
		txtInput.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtInput.setBounds(278, 23, 194, 41);
		panel.add(txtInput);
		txtInput.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Withdraw.main(null);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBackground(Color.BLUE);
		btnBack.setBounds(594, 325, 101, 34);
		panel.add(btnBack);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Verification.main(null);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(221, 374, 101, 34);
		panel.add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					short sika = 10;
					double amount = Double.parseDouble(txtInput.getText());
					if(amount < sika || amount%5 != 0 ) {
						JOptionPane.showMessageDialog(panel, "Enter amount in multiples of 5");
					}else if(amount > 5000) {
						JOptionPane.showMessageDialog(panel, "The amount you're trying to withdraw exceeds limit.");
					}else {
						JOptionPane.showMessageDialog(panel, " You have successfully withdraw GH¢"+amount);
						txtInput.setText(null);
					}
				}catch (Exception error) {
					JOptionPane.showMessageDialog(panel, "Enter a valid amount!");
				}
				
				
			}
		});
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setBounds(386, 374, 101, 34);
		panel.add(btnOk);
	}
}
