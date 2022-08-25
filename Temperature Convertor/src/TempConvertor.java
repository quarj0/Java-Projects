import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class TempConvertor {

	private JFrame frame;
	private JTextField txtNoTemperatureSelected;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempConvertor window = new TempConvertor();
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
	public TempConvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperature Converter");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel.setBounds(26, 11, 380, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select temp. type");
		lblNewLabel_1.setBounds(10, 59, 92, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(205, 133, 63));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "Degree Celsius", "Fahrenheit"}));
		comboBox.setBounds(142, 58, 151, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnOK = new JButton("OK");
		btnOK.setForeground(new Color(112, 128, 144));
		btnOK.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s="" + comboBox.getItemAt(comboBox.getSelectedIndex());
				txtNoTemperatureSelected.setText(s);
			}
		});
		btnOK.setBounds(315, 58, 57, 23);
		frame.getContentPane().add(btnOK);
		
		JLabel lblNewLabel_2 = new JLabel("Selected temperature ");
		lblNewLabel_2.setBounds(10, 95, 107, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtNoTemperatureSelected = new JTextField();
		txtNoTemperatureSelected.setForeground(SystemColor.desktop);
		txtNoTemperatureSelected.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNoTemperatureSelected.setBackground(SystemColor.scrollbar);
		txtNoTemperatureSelected.setBounds(142, 91, 151, 20);
		frame.getContentPane().add(txtNoTemperatureSelected);
		txtNoTemperatureSelected.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter temperature");
		lblNewLabel_3.setBounds(10, 136, 92, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setForeground(SystemColor.desktop);
		textField_1.setBackground(SystemColor.scrollbar);
		textField_1.setBounds(142, 133, 151, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(178, 34, 34));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				Double a = Double.parseDouble(textField_1.getText());
				if(txtNoTemperatureSelected.getText().equals("Degree Celsius")) {
					
					Double x = (9*a)/5+32;
					textField_2.setText(x + "°F");
				}else {
					Double y = (a-32)/9*5;
					textField_2.setText(y + "°C");
				}
			}catch(Exception e1) {
				JOptionPane.showMessageDialog(frame, "Invalid number! Please try again.");
			}
		}
			});
		btnSubmit.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setToolTipText("Submit your input");
		btnSubmit.setBounds(175, 227, 90, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel_4 = new JLabel("Converted temperature");
		lblNewLabel_4.setBounds(10, 178, 107, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Roboto Condensed", Font.ITALIC, 15));
		textField_2.setForeground(new Color(255, 0, 0));
		textField_2.setBackground(SystemColor.control);
		textField_2.setBounds(142, 175, 151, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
