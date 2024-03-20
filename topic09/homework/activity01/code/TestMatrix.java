import java.util.Scanner;
import interfaces.Imatrix;

public class TestMatrix {

    public static Scanner scanner = new Scanner(System.in);
    public Imatrix matrixOperations = new Matrix();

    public static void main(String[] args) {
        new TestMatrix().runApp();
    }

    private void runApp() {
        while (true) {
            System.out.println("\n1. Multiply matrix by matrix");
            System.out.println("2. Multiply matrix by vector");
            System.out.println("3. Addition");
            System.out.println("4. Greatest");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        multiplyMatrixByMatrix();
                        break;
                    case 2:
                        multiplyMatrixByVector();
                        break;
                    case 3:
                        additionMatrixByMatrix();
                        break;
                    case 4:
                        findGreatestInMatrix();
                        break;
                    case 5:
                        System.out.println("Exiting program... Bye!");
                        return;
                    default:
                        System.out.println("Invalid option. Try again...");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index is out of bounds. Please check the sizes of your matrices/vectors.");
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
        try {
            matrixOperations.multiply(a, b, result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error in matrix multiplication: " + e.getMessage());
            return;
        }

        System.out.println("\nResult:");
        matrixOperations.print(result);
    }

    private void multiplyMatrixByVector() {
        System.out.println("\nMatrix:");
        int[][] matrix = readMatrix();

        System.out.print("Enter the size of the vector: ");
        int vectorSize = scanner.nextInt();

        if (vectorSize != matrix[0].length) {
            System.out.println("The size of the vector is not compatible with the number of columns in the matrix. Try again...");
            return;
        }

        System.out.println("Vector:");
        int[] vector = new int[vectorSize];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter element [" + (i + 1) + "]: ");
            vector[i] = scanner.nextInt();
        }
        int[] result = new int[matrix.length];
        try {
            matrixOperations.multiply(matrix, vector, result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error in matrix and vector multiplication: " + e.getMessage());
            return;
        }

        System.out.println("\nResult:");
        matrixOperations.print(result);
    }

    private void additionMatrixByMatrix() {
        System.out.println("\nMatrix A:");
        int[][] a = readMatrix();
    
        System.out.println("\nMatrix B:");
        int[][] b = readMatrix();
    
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Matrices must be of the same dimensions for addition. Try again...");
            return;
        }
    
        int[][] result = new int[a.length][a[0].length];
        try {
            matrixOperations.addition(a, b, result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error in matrix addition: " + e.getMessage());
            return;
        }
    
        System.out.println("\nResult of Addition:");
        matrixOperations.print(result);
    }

    private void findGreatestInMatrix() {
        System.out.println("\nMatrix for finding greatest element:");
        int[][] matrix = readMatrix();
    
        try {
            int greatest = matrixOperations.greatest(matrix);
            System.out.println("The greatest element in the matrix is: " + greatest);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error finding the greatest element: " + e.getMessage());
        }
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
