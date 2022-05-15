package formulario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class formulario2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario2 window = new formulario2();
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
	public formulario2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.getContentPane().setForeground(new Color(255, 255, 225));
		frame.setBounds(100, 100, 397, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton variable = new JButton("Insertar datos");
		variable.setHorizontalAlignment(SwingConstants.LEFT);
		variable.setForeground(Color.BLACK);
		variable.setBackground(Color.MAGENTA);
		variable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		variable.setBounds(33, 157, 101, 33);
		frame.getContentPane().add(variable);
		
		JButton btnLimpiarDatos = new JButton("Limpiar datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton de limpiar");
			}
		});
		btnLimpiarDatos.setHorizontalAlignment(SwingConstants.LEFT);
		btnLimpiarDatos.setForeground(Color.BLACK);
		btnLimpiarDatos.setBackground(Color.MAGENTA);
		btnLimpiarDatos.setBounds(194, 157, 108, 33);
		frame.getContentPane().add(btnLimpiarDatos);
		
		textField = new JTextField();
		textField.setBounds(216, 80, 138, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.MAGENTA);
		textField_1.setBounds(216, 49, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(216, 111, 138, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea txtrDatosDeDepartamentos = new JTextArea();
		txtrDatosDeDepartamentos.setForeground(Color.BLUE);
		txtrDatosDeDepartamentos.setText("DATOS DE DEPARTAMENTOS");
		txtrDatosDeDepartamentos.setBounds(98, 11, 181, 27);
		frame.getContentPane().add(txtrDatosDeDepartamentos);
		
		JTextArea txtrCodigoDeDepartamento = new JTextArea();
		txtrCodigoDeDepartamento.setBackground(SystemColor.info);
		txtrCodigoDeDepartamento.setText("Codigo de departamento");
		txtrCodigoDeDepartamento.setBounds(0, 47, 181, 20);
		frame.getContentPane().add(txtrCodigoDeDepartamento);
		
		JTextArea txtrNombreDeDepartamento = new JTextArea();
		txtrNombreDeDepartamento.setText("Nombre de departamento");
		txtrNombreDeDepartamento.setBackground(SystemColor.info);
		txtrNombreDeDepartamento.setBounds(0, 78, 181, 20);
		frame.getContentPane().add(txtrNombreDeDepartamento);
		
		JTextArea txtrLocalidadDepartamento = new JTextArea();
		txtrLocalidadDepartamento.setText("Localidad departamento");
		txtrLocalidadDepartamento.setBackground(SystemColor.info);
		txtrLocalidadDepartamento.setBounds(0, 109, 181, 20);
		frame.getContentPane().add(txtrLocalidadDepartamento);
	}
}
