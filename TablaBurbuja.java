package unico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class TablaBurbuja {
	/*
	 * /* leer una matriz de 10 enteros y los ordene por el método de la Burbuja de
	 * menor a mayor.
	 */

	Integer[] matriz;
	Random r = new Random();
	List<Integer> listaOrdenada = new ArrayList<Integer>();
	//private int dim;

	// constructor
	public TablaBurbuja(int dim) {
		// rellenar tabla
		matriz = new Integer[dim];
		for (int pos = 0; pos < dim; pos++) {

			matriz[pos] = r.nextInt(10);
		}
	}
	@Override
	public String toString() {
		return "Tabla [matriz=" + Arrays.toString(matriz) + "]";
	}

	void ordenarPorBurbuja( int n) { //n= dimension de la tabla o matriz
	    int temp; 
	    for(int k = 0; k< n-1; k++) { 
	        // (n-k-1) es para ignorar comparaciones de elementos que ya han sido comparados en otras iteraciones
	 
	        for(int i = 0; i < n-k-1; i++) { 
	            if(matriz[ i ] > matriz[ i+1] ) { 
	   
	                temp = matriz[ i ]; 
	                matriz[ i ] = matriz[ i+1 ]; 
	                matriz[ i + 1] = temp; 
	            
	}}
	    }}}
