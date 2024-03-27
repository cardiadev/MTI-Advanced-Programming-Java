
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;
        int a[][], b[][], r[][];


        Matrix matrix = new Matrix();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Multiply matrix by matrix\n"
                    + "2. Exit");
            System.out.print("Option: ");
            input = scanner.nextInt();

	    try {
                switch (input) {
                    case 1:
                        System.out.println("\nCaptura la primer matriz:");
                        a = readMatrix();
                        System.out.println("\nCaptura la segunda matriz:");
                        b = readMatrix();
                        r = new int[a.length][b[0].length];
                        //r = new int[10][10]; //TEST assertion (postcondition)
                        matrix.multiply(a, b, r);
			System.out.println("\nResult:");
                        matrix.print(r);
                        break;
                    case 2:
                        break;

                }
            } catch (Exception e) {
		e.printStackTrace();
            }



        } while (input != 2);

    }


   public static int[][] readMatrix() {
        int filas = 0, columnas = 0;
        int m[][];
        System.out.print("Numero de renglones? ");
        filas = scanner.nextInt();
        System.out.print("Numero de columnas? ");
        columnas = scanner.nextInt();

        m = new int[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print("Valor para [" + fila + "][" + columna + "]: ");
                m[fila][columna] = scanner.nextInt();
            }
        }
        return m;
    }
}
