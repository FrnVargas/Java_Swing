package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppOrdenarIntercambio {

	private JFrame frmMetodoOrdenarPor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppOrdenarIntercambio window = new AppOrdenarIntercambio();
					window.frmMetodoOrdenarPor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppOrdenarIntercambio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMetodoOrdenarPor = new JFrame();
		frmMetodoOrdenarPor.setTitle("Metodo Ordenar por Intercambio");
		frmMetodoOrdenarPor.setBounds(100, 100, 450, 300);
		frmMetodoOrdenarPor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetodoOrdenarPor.getContentPane().setLayout(null);
		JTextArea ta = new JTextArea();
		ta.setEditable(false);
		ta.setBounds(35, 22, 330, 156);
		frmMetodoOrdenarPor.getContentPane().add(ta);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaIntercambio test = new TablaIntercambio(10);
			ta.insert("Desordenado " + test.toString(),0);
				test.ordenarIntercambio();
				ta.insert("\n",0);
				ta.insert("Ordenado: " + test.toString(),0);
			}
		});
		btnAceptar.setBounds(256, 215, 91, 23);
		frmMetodoOrdenarPor.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		btnCancelar.setBounds(49, 215, 91, 23);
		frmMetodoOrdenarPor.getContentPane().add(btnCancelar);
		

	}
}
