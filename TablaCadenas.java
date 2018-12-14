package unico;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class TablaCadenas {

	
	ArrayList <String>lstCadena ;
	String []tabla;
	
	public TablaCadenas(int dim){
		
		lstCadena = new ArrayList<String>();
		tabla= new String[dim];
	
	
	}
		
		@Override
	public String toString() {
		return "Tabla [tabla=" + Arrays.toString(tabla) + "]";
	}

		public void rellenarTabla() {
		
		for ( int pos =0;pos<tabla.length;pos++ ) {
			tabla[pos]= JOptionPane.showInputDialog("Introduzca cadena:   ");
			//lstCadena.add(tabla[pos]);
			
			
			
		}
		}
		
		
		
		
	}
	

