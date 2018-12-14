package unico;

import java.util.Arrays;
import java.util.Random;

public class TablaIntercambio {
Integer matriz[];
Random r = new Random();
public TablaIntercambio(int dim) {
	/*leer  una matriz de 10 caracteres y los ordene por el método de Inserción de menor a mayor. */
	matriz = new Integer[dim];	
	for( int i = 0;i<dim;i++) {
		matriz[i]= r.nextInt(10);
	}
	}
	@Override
public String toString() {
	return "Tabla [matriz=" + Arrays.toString(matriz) + "]";
}


	public void ordenarIntercambio() {
		for (int i =0;i<matriz.length	;i++) {
			for (int j =i+1;j<matriz.length;j++) {
				if (matriz[i] < matriz[j]) {
				int	tmp =matriz[i] ;
					matriz[i]=matriz[j];
					matriz[j]= tmp;
					
					
				}}}}				
				}
	  