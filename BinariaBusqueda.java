package unico;
import javax.swing.JOptionPane;
public class BinariaBusqueda {
	public static void main(String[] args) {
		
//	 BusquedaBimaria_Swing ventana = new 	 BusquedaBimaria_Swing();
		TablaBinaria test = new TablaBinaria(10);
	JOptionPane.showMessageDialog(null,test);
test.sort();
int num =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que desea buscar  : "));
JOptionPane.showMessageDialog(null,"Matriz ordenada:  "+ test);
JOptionPane.showMessageDialog(null, " Posicion:  " + test.buscar(test.matriz, num));
	}
}
