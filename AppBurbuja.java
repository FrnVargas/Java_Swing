package unico;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class AppBurbuja {
	private JFrame frmOrdenarPorEl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppBurbuja window = new AppBurbuja();
					window.frmOrdenarPorEl.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppBurbuja() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOrdenarPorEl = new JFrame();
		frmOrdenarPorEl.setTitle("Ordenar por el metodo Burbuja");
		frmOrdenarPorEl.setBounds(100, 100, 450, 300);
		frmOrdenarPorEl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOrdenarPorEl.getContentPane().setLayout(null);
		JTextArea ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setEditable(false);
		ta.setBounds(56, 35, 306, 149);
		frmOrdenarPorEl.getContentPane().add(ta);
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaBurbuja test = new TablaBurbuja(10);
				ta.insert("Desordenado:  " + test.toString(),0);
				test.ordenarPorBurbuja( 10);
				ta.insert("\n",0);
				ta.insert("Ordenado: " + test.toString(),0);
			}
		} );
		btnNewButton.setBounds(181, 195, 84, 39);
		frmOrdenarPorEl.getContentPane().add(btnNewButton);
	}
}
