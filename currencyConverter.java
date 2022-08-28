package converter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class currencyConverter {

	private JFrame frmJavaCurrencyConverter;
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
					window.frmJavaCurrencyConverter.setVisible(true);
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frmJavaCurrencyConverter = new JFrame();
		frmJavaCurrencyConverter.setType(Type.POPUP);
		frmJavaCurrencyConverter.setTitle("Java Currency Converter");
		frmJavaCurrencyConverter.setResizable(false);
		frmJavaCurrencyConverter.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Quarjo\\Downloads\\currency-g156cde642_1280.png"));
		frmJavaCurrencyConverter.getContentPane().setBackground(new Color(0, 102, 153));
		frmJavaCurrencyConverter.setBackground(Color.ORANGE);
		frmJavaCurrencyConverter.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmJavaCurrencyConverter.setBounds(100, 100, 450, 300);
		frmJavaCurrencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCurrencyConverter.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Niagara Engraved", Font.PLAIN, 69));
		lblNewLabel.setBounds(34, 0, 330, 65);
		frmJavaCurrencyConverter.getContentPane().add(lblNewLabel);
		
		JLabel convertFrom = new JLabel("Convert from");
		convertFrom.setForeground(new Color(0, 204, 255));
		convertFrom.setBackground(SystemColor.activeCaptionBorder);
		convertFrom.setFont(new Font("Segoe UI Historic", Font.BOLD | Font.ITALIC, 16));
		convertFrom.setBounds(20, 76, 103, 14);
		frmJavaCurrencyConverter.getContentPane().add(convertFrom);
		
		JComboBox txtFrom = new JComboBox();
		txtFrom.setForeground(SystemColor.textHighlight);
		txtFrom.setToolTipText("Select currency to convert from");
		txtFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFrom.setModel(new DefaultComboBoxModel(new String[] {"USD $", "Cedi GH¢"}));
		txtFrom.setBounds(133, 72, 131, 22);
		frmJavaCurrencyConverter.getContentPane().add(txtFrom);
		
		JLabel convertTo = new JLabel("Convert to");
		convertTo.setForeground(new Color(0, 204, 204));
		convertTo.setFont(new Font("Segoe UI Historic", Font.BOLD | Font.ITALIC, 16));
		convertTo.setBounds(20, 106, 90, 14);
		frmJavaCurrencyConverter.getContentPane().add(convertTo);
		
		JComboBox txtTo = new JComboBox();
		txtTo.setForeground(SystemColor.textHighlight);
		txtTo.setToolTipText("Select currency to convert to");
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"USD $", "Cedi GH¢"}));
		txtTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTo.setBounds(133, 105, 131, 22);
		frmJavaCurrencyConverter.getContentPane().add(txtTo);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(218, 165, 32));
		btnOk.setForeground(new Color(255, 255, 255));
		btnOk.setToolTipText("Click here to convert");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Double sika;
				Double amount = Double.parseDouble(textField.getText());
				if(txtFrom.getSelectedItem().toString()=="USD $" && txtTo.getSelectedItem().toString()=="Cedi GH¢") {
					sika = amount * 9.95;
					JOptionPane.showMessageDialog(btnOk, "Equivalent to: GH¢" +sika.floatValue());
				}else if (txtFrom.getSelectedItem().toString()=="Cedi GH¢" && txtTo.getSelectedItem().toString()=="USD $") {
					sika = amount / 9.95;
					JOptionPane.showMessageDialog(btnOk, "Equivalent to: $" +sika.floatValue());
				}else if(txtFrom.getSelectedItem().toString()=="USD $" && txtTo.getSelectedItem().toString()=="USD $"){
					sika = amount;
					JOptionPane.showMessageDialog(btnOk, "Equivalent to: $" +sika.floatValue());
				}else {
					sika = amount;
					JOptionPane.showMessageDialog(btnOk, "Equivalent to: GH¢" +sika.floatValue());
				}
				} catch(Exception e1){
					JOptionPane.showMessageDialog(btnOk, "Invalid! Enter amount to convert");
				}
				}
		});
		btnOk.setBounds(151, 186, 89, 23);
		frmJavaCurrencyConverter.getContentPane().add(btnOk);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(20, 138, 74, 14);
		frmJavaCurrencyConverter.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("Enter your amount.");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(133, 138, 122, 20);
		frmJavaCurrencyConverter.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
