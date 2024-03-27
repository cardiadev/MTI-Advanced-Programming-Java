import interfaces.IMatrix;

public class Matrix implements IMatrix {

	public void multiply(int a[][], int b[][], int r[][]) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
	    // precondicion
	    if(a[0].length != b.length) {
            	throw new IllegalArgumentException("Los tamaños de las matrices no son compatibles");
            }

	    try {
            	for (int i = 0; i < a.length; i++) { // matrix rows (vertical) 
                	for (int j = 0; j < b[0].length; j++) { // matrix columns (horizontal)
                    		for (int k = 0; k < b.length; k++) {
                        		r[i][j] = r[i][j] + a[i][k] * b[k][j];
                    		}
                	}
		}
		//r[100][100] = 0; // TEST array out of bound
	    } catch (ArrayIndexOutOfBoundsException e) {
            	//System.out.println("Arreglo fuera de limites");
            	//e.printStackTrace();
		throw new ArrayIndexOutOfBoundsException("Arreglo fuera de limites");
            }

            // postcondicion: valida las dimensiones de la matriz resultante
            assert(r.length == a.length && r[0].length == b[0].length) : "Las dimensiones de la matriz resultante son incorrectas";

	}

	
	public void print(int m[][]) {
        try {
            //for (int fila = 0; fila < 100; fila++) {//TEST OutOfBoundsExep
            for (int fila = 0; fila < m.length; fila++) {
                for (int columna = 0; columna < m[0].length; columna++) {
                    System.out.print("[" + m[fila][columna] + "]");
                }
                System.out.println("");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arreglo fuera de limites");
            e.printStackTrace();
        }

    }


}
