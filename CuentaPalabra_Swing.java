package unico;

/* lea una frase y nos muestre  por  pantalla  el  número  de  veces  que  aparece  una  palabra  en concreto en dicha frase.*/
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CuentaPalabra_Swing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuentaPalabra_Swing window = new CuentaPalabra_Swing();
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
	public CuentaPalabra_Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Cuenta letras");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JTextArea ta = new JTextArea();
	
		ta.setEditable(false);
		ta.setLineWrap(true);
		ta.setBounds(30, 32, 389, 148);
		frame.getContentPane().add(ta);
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cuentaletras();
			}

			private void cuentaletras() {
				String s=JOptionPane.showInputDialog("Introduzca la  frase ");
				ta.insert(s,0);
				ta.insert("\n ",0);
				String s1 = JOptionPane.showInputDialog("Introduzca la palabra que quiere contar....");
				int cont = 0;
						String[] tokens = s.split( " " );
						for ( String token : tokens ) {
							if (token.matches(s1)){
								cont++;
							}
				}ta.insert("La palabra  "+ s1+ " aparece "   +  cont+ " veces.",0);
				
				
			}
		});
		btnIniciar.setBounds(315, 223, 91, 23);
		frame.getContentPane().add(btnIniciar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
			
		});
		btnCancelar.setBounds(39, 223, 91, 23);
		frame.getContentPane().add(btnCancelar);
		
	
	}
}
