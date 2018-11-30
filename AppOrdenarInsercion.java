package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AppOrdenarInsercion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppOrdenarInsercion window = new AppOrdenarInsercion();
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
	public AppOrdenarInsercion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Metodo Ordenar por Insercion");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea ta = new JTextArea();
		ta.setEditable(false);
		ta.setBounds(42, 11, 338, 165);
		frame.getContentPane().add(ta);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaInsercion test = new TablaInsercion(10);
		ta.insert("Desordenado: "+ test.toString(),0);
				test.ordenarInsercion();
				ta.insert("\n",0);
				ta.insert("Ordenado: "+ test.toString(),0);
				
				
			}
		});
		btnAceptar.setBounds(298, 204, 91, 23);
		frame.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(61, 204, 91, 23);
		frame.getContentPane().add(btnCancelar);
		

	}
}
