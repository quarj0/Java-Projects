package converter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class currencyConverter {

	private JFrame frame;
	private JTextField textField;
	protected int result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyConverter window = new currencyConverter();
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
	public currencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(53, 11, 353, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel convertFrom = new JLabel("Convert from");
		convertFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		convertFrom.setBounds(20, 76, 103, 14);
		frame.getContentPane().add(convertFrom);
		
		JComboBox txtFrom = new JComboBox();
		txtFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFrom.setModel(new DefaultComboBoxModel(new String[] {"USD $", "Cedi GH¢"}));
		txtFrom.setBounds(133, 72, 131, 22);
		frame.getContentPane().add(txtFrom);
		
		JLabel convertTo = new JLabel("Convert to");
		convertTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		convertTo.setBounds(20, 106, 90, 14);
		frame.getContentPane().add(convertTo);
		
		JComboBox txtTo = new JComboBox();
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"USD $", "Cedi GH¢"}));
		txtTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTo.setBounds(133, 105, 131, 22);
		frame.getContentPane().add(txtTo);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double sika;
				Double amount = Double.parseDouble(textField.getText());
				if(txtFrom.getSelectedItem().toString()=="USD $" && txtTo.getSelectedItem().toString()=="Cedi GH¢") {
					sika = amount * 9.95;
					JOptionPane.showMessageDialog(btnOk, "Amount " +sika);
				}else if (txtFrom.getSelectedItem().toString()=="Cedi GH¢" && txtTo.getSelectedItem().toString()=="USD $") {
					sika = amount / 9.95;
					JOptionPane.showMessageDialog(btnOk, "Amount " +sika);
				}
			}
		});
		btnOk.setBounds(151, 186, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 138, 63, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(133, 138, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
