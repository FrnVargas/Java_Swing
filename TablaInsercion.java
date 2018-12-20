package unico;
import java.util.Arrays;
import java.util.Random;
public class TablaInsercion {
Integer matriz[];
Random r = new Random();
public TablaInsercion(int dim) {
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
	public void ordenarInsercion() {
	        final int N = matriz.length;
	        for(int i=1; i<N; i++) {
	        int j=i;
	            while(j>0 && matriz[j]<matriz[j-1] ){
	               int tmp = matriz[j];
	                matriz[j]    = matriz[j-1];
	                matriz[j-1]  = tmp;
	                j--;
	            }}}
} 
