package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMetodoSeleccion {

	private JFrame frmMetodoDeSeleccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMetodoSeleccion window = new AppMetodoSeleccion();
					window.frmMetodoDeSeleccion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMetodoSeleccion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMetodoDeSeleccion = new JFrame();
		frmMetodoDeSeleccion.setTitle("Metodo de seleccion");
		frmMetodoDeSeleccion.setBounds(100, 100, 450, 300);
		frmMetodoDeSeleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetodoDeSeleccion.getContentPane().setLayout(null);
		JTextArea ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setEditable(false);
		ta.setBounds(26, 11, 406, 141);
		frmMetodoDeSeleccion.getContentPane().add(ta);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaSeleccion test = new TablaSeleccion(10);
				ta.insert(  "Desordenado :   "      +      test.toString(),0);
				test.ordenarSeleccion();
				ta.insert("\n",0);
				ta.insert  (    "Ordenado  :      "     +   test.toString(),0);
			}
		});
		btnAceptar.setBounds(256, 182, 91, 23);
		frmMetodoDeSeleccion.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(48, 182, 91, 23);
		frmMetodoDeSeleccion.getContentPane().add(btnCancelar);
		
	
	}

}
