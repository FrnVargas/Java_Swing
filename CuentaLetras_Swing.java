package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CuentaLetras_Swing {

	private JFrame frmCuentaLetras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuentaLetras_Swing window = new CuentaLetras_Swing();
					window.frmCuentaLetras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CuentaLetras_Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCuentaLetras = new JFrame();
		frmCuentaLetras.setTitle("Cuenta Letras");
		frmCuentaLetras.setBounds(100, 100, 450, 300);
		frmCuentaLetras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCuentaLetras.getContentPane().setLayout(null);
		JTextArea ta = new JTextArea();
		ta.setWrapStyleWord(true);
		ta.setLineWrap(true);
		ta.setEditable(false);
		ta.setBounds(10, 11, 411, 179);
		frmCuentaLetras.getContentPane().add(ta);
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = JOptionPane.showInputDialog("Introduzca frase para analizar.....").toLowerCase();
				
				String s1= JOptionPane.showInputDialog("Introduzca letra o numero  para analizar.....").toLowerCase();
				String[] letra = s.split("");
				int cont = 0;
			
				for (String l : letra) {
					if (l.matches(s1)) {
						cont++;
					}
					}
				if (cont ==0) {
					ta.insert("La letra que buscas '"+s1+"'  no aparece en este texto...." ,0);
						}else {
							ta.insert("La letra que buscas '"+s1+"'  aparece "+ cont+ " veces",0);
						}
					}
				
			
		});
		btnIniciar.setBounds(324, 228, 91, 23);
		frmCuentaLetras.getContentPane().add(btnIniciar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(31, 228, 91, 23);
		frmCuentaLetras.getContentPane().add(btnCancelar);
		
	
	}

}
