package unico;
import java.util.Arrays;
import java.util.Random;
public class TablaSeleccion {
Double matriz[];
Random r = new Random();
public TablaSeleccion(int dim) {
/*3leer una matriz  de  10  reales  y  los  ordene  por  el  método  de  Selección  de  mayor  a  menor. */
	matriz = new Double[dim];	
	for( int i = 0;i<dim;i++) {
		matriz[i]=  r.nextDouble();
	}
	}
	@Override
public String toString() {
	return "Tabla [matriz=" + Arrays.toString(matriz) + "]";
}
	public void ordenarSeleccion() {
		for (int i =0;i<=matriz.length-1;i++) {
			int posMenor=i;
			for (int j =i+1;j<matriz.length;j++) {
				if(matriz[j]<matriz[posMenor]) {
					posMenor=j;
				}       
		        if(posMenor!=i) {
	           Double tmp     = matriz[i];
	                matriz[i]        = matriz[posMenor];
	                matriz[posMenor] = tmp;
	            }
	
			            }
				}}}		  
