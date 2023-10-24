package frutas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import repaso1.fruteria;
import repaso1.listafruteria;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textField_color;
	private JTextField textField_peso;
	listafruta fruta = new listafruta ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre fruta:");
		lblNewLabel.setBounds(25, 33, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Color:");
		lblNewLabel_1.setBounds(25, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Peso:");
		lblNewLabel_2.setBounds(25, 97, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(146, 30, 86, 20);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		textField_color = new JTextField();
		textField_color.setBounds(146, 58, 86, 20);
		contentPane.add(textField_color);
		textField_color.setColumns(10);
		
		textField_peso = new JTextField();
		textField_peso.setBounds(146, 94, 86, 20);
		contentPane.add(textField_peso);
		textField_peso.setColumns(10);
		
		JButton btnNewButtonAdd = new JButton("Agregar");
		btnNewButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textFieldNom.getText();
				int peso = (Integer.parseInt(textField_peso.getText()));
				String color = textField_color.getText();
				clasefruta nuevo = new clasefruta (nombre, color, peso);
				fruta.insertarDondeSea(nuevo);
				textFieldNom.setText("");
				textField_color.setText("");
				textField_peso.setText("");
							}
		});
		btnNewButtonAdd.setBounds(282, 29, 89, 23);
		contentPane.add(btnNewButtonAdd);
		
		JButton btnNewButton_terminar = new JButton("Terminar");
		btnNewButton_terminar.setBounds(282, 74, 89, 23);
		contentPane.add(btnNewButton_terminar);
		
		JButton btnNewButtonAnterior = new JButton("Anterior");
		btnNewButtonAnterior.setBounds(75, 154, 89, 23);
		contentPane.add(btnNewButtonAnterior);
		
		JButton btnNewButtonSig = new JButton("Siguiente");
		btnNewButtonSig.setBounds(200, 154, 89, 23);
		contentPane.add(btnNewButtonSig);
	}
}
