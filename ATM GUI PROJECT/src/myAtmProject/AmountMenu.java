package myAtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AmountMenu {

	private JFrame frame;
	private JTextField txtNum;
	private JTextField txtAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmountMenu window = new AmountMenu();
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
	public AmountMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setResizable(false);
		frame.setBounds(100, 100, 806, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 770, 439);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Verification.main(null);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(248, 369, 101, 34);
		panel.add(btnCancel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a network", "MTN", "Vodafone", "AirtelTigo"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(548, 56, 164, 28);
		panel.add(comboBox);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int mobiNum = (int) Double.parseDouble(txtNum.getText());
					double amount =Double.parseDouble(txtAmount.getText());
					if (mobiNum > 1000000000 || mobiNum == amount || mobiNum < 239537405) {
						JOptionPane.showMessageDialog(panel, "Mobile number might not be valid!");
						comboBox.getSelectedItem();
					}
					else if(amount < 10 || amount > 3000) {
						JOptionPane.showMessageDialog(panel, "Invalid amount entered!");
						comboBox.getSelectedItem();
					}else if (comboBox.getSelectedIndex() ==0) {
						JOptionPane.showMessageDialog(panel, "Otwee select a network");
					}else {
					int option =	JOptionPane.showConfirmDialog(panel, "Confirm transaction ?");
						if (option == 0) {
							JOptionPane.showMessageDialog(panel, "You have successfully transferred an amount of Gh¢"+amount + "\nto "+ comboBox.getSelectedItem() +
									" No. "+ mobiNum);
						}else {
							JOptionPane.showMessageDialog(panel, "Transfer has been cancelled.");
						}
						
					}
				}catch (Exception error) {
					JOptionPane.showMessageDialog(panel, "An error occured! \n Please try again");
				}
				
			}
		});
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setBounds(413, 369, 101, 34);
		panel.add(btnOk);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transfer.main(null);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBackground(Color.BLUE);
		btnBack.setBounds(611, 291, 101, 34);
		panel.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Enter Mobile No.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(31, 56, 139, 28);
		panel.add(lblNewLabel);
		
		txtNum = new JTextField();
		txtNum.setForeground(Color.DARK_GRAY);
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNum.setBounds(220, 56, 181, 27);
		panel.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Amount");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 105, 139, 28);
		panel.add(lblNewLabel_1);
		
		txtAmount = new JTextField();
		txtAmount.setForeground(Color.DARK_GRAY);
		txtAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAmount.setColumns(10);
		txtAmount.setBounds(220, 105, 181, 27);
		panel.add(txtAmount);
	}
}
