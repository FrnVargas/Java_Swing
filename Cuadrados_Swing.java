package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Cuadrados_Swing {

	private JFrame frmCuadrados;
	private JTextField tfNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuadrados_Swing window = new Cuadrados_Swing();
					window.frmCuadrados.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cuadrados_Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCuadrados = new JFrame();
		frmCuadrados.setTitle("Cuadrados");
		frmCuadrados.setBounds(100, 100, 450, 300);
		frmCuadrados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCuadrados.getContentPane().setLayout(null);
		
		JLabel lblNum = new JLabel("Introduzca Numero:");
		lblNum.setBounds(10, 29, 135, 14);
		frmCuadrados.getContentPane().add(lblNum);
		
		tfNum = new JTextField();
		tfNum.setBounds(178, 26, 86, 20);
		frmCuadrados.getContentPane().add(tfNum);
		tfNum.setColumns(10);
		JTextArea info = new JTextArea();
		info.setLineWrap(true);
		info.setEditable(false);
		info.setBounds(23, 80, 409, 98);
		frmCuadrados.getContentPane().add(info);
		
		
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			

		

			public void actionPerformed(ActionEvent arg0) {
				mostrarCuadrados();
			}

			private void mostrarCuadrados() {
				String x = tfNum.getText();
			
				//calculo
			
			Integer j =9;      // diezSiguientes.length;
			String sal="";
			for(int n=0;n<= j;n++) {	
			Integer	y= Integer.parseInt(x);
			Double res=0.0;
				res = res +  Math.pow(y  +  n,2);
				
				sal = sal + res.toString()+" ;";
				
				info.setText(sal);
				
				}
			
				
			}
		});
		btnNewButton.setBounds(308, 189, 91, 23);
		frmCuadrados.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(54, 189, 91, 23);
		frmCuadrados.getContentPane().add(btnNewButton_1);
		
	
	}

}
