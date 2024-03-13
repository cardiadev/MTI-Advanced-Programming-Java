import java.util.Scanner;
import interfaces.Imatrix;

public class TestMatrix {

    public static Scanner scanner = new Scanner(System.in);
    private Imatrix matrixOperations = new Matrix();

    public static void main(String[] args) {
        new TestMatrix().runApp();
    }

    private void runApp() {
        while (true) {
            System.out.println("\n1. Multiply matrix by matrix");
            System.out.println("2. Multiply matrix by vector");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    multiplyMatrixByMatrix();
                    break;
                case 2:
                    multiplyMatrixByVector();
                    break;
                case 3:
                    System.out.println("Exiting program... Bye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again...");
            }
        }
    }

    private void multiplyMatrixByMatrix() {
        System.out.println("\nMatrix A:");
        int[][] a = readMatrix();

        System.out.println("\nMatrix B:");
        int[][] b = readMatrix();

        if (a[0].length != b.length) {
            System.out.println("Matrices are not compatible for multiplication. Try again...");
            return;
        }

        int[][] result = new int[a.length][b[0].length];
        matrixOperations.multiply(a, b, result);

        System.out.println("\nResult:");
        matrixOperations.print(result);
    }

    private void multiplyMatrixByVector() {
        System.out.println("\nMatrix:");
        int[][] matrix = readMatrix();
        System.out.println("Vector (same number of elements as columns in the matrix):");
        int[] vector = new int[matrix[0].length];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter element [" + (i + 1) + "]: ");
            vector[i] = scanner.nextInt();
        }
        int[] result = new int[matrix.length];
        matrixOperations.multiply(matrix, vector, result);

        System.out.println("\nResult:");
        matrixOperations.print(result);
    }

    private int[][] readMatrix() {
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
