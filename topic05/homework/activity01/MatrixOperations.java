package topic05;

import java.util.Scanner;

public class MatrixOperations {

    public static Scanner scanner = new Scanner(System.in);

    // User Menu
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Multiply matrix by matrix");
            System.out.println("2. Multiply matrix by vector");
            System.out.println("3. Summation of odd numbers");
            System.out.println("4. Greatest");
            System.out.println("5. Exit ");
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
                    summationOfOddNumbers();
                    break;
                case 4:
                    findGreatest();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Exiting program... Bye Buddy!");
                    System.out.println();
                    return;
                default:
                    System.out.println();
                    System.out.println("Invalid option. Try again...");
            }
        }
    }

    // Methods for matrix operations

    public static void multiplyMatrixByMatrix() {
        System.out.println();
        System.out.println("Matrix A");
        int[][] a = readMatrix();
        
        System.out.println();
        System.out.println("Matrix B");
        int[][] b = readMatrix();
        
        if (a[0].length != b.length) {
            System.out.println("Matrices are not compatible for multiplication. Try again...");
            return;
        }
        int[][] result = new int[a.length][b[0].length];        
        matrixXmatrix(a, b, result);
        System.out.println();
        System.out.println("Result:");
        printMatrix(result);
    }

    public static void multiplyMatrixByVector() {
        System.out.println();
        System.out.println("Matrix:");
        int[][] matrix = readMatrix();
        System.out.println("Vector (same number of elements as columns in the matrix):");
        int[] vector = new int[matrix[0].length];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter element [" + (i + 1) + "]: ");
            vector[i] = scanner.nextInt();
        }
        int[] result = new int[matrix.length];
        matrixXvector(matrix, vector, result);
        System.out.println();
        System.out.println("Result:");
        printVector(result);
    }

    public static void summationOfOddNumbers() {
        System.out.println();
        System.out.println("Matrix:");
        int[][] matrix = readMatrix();
        System.out.println();
        System.out.println("Sum of Odd Numbers: " + summationOdd(matrix));
    }

    public static void findGreatest() {
        System.out.println();
        System.out.println("Matrix:");
        int[][] matrix = readMatrix();
        System.out.println();
        System.out.println("Greatest number in the matrix: " + greatest(matrix));
    }

    // Read matrix from user
    public static int[][] readMatrix() {
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Show the position of the element
                System.out.print("Enter element [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Multiply matrix by matrix
    public static void matrixXmatrix(int[][] m, int[][] b, int[][] r) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < m[0].length; k++) {
                    r[i][j] += m[i][k] * b[k][j];
                }
            }
        }
    }

    // Multiply matrix by vector
    public static void matrixXvector(int[][] m, int[] v, int[] r) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i] += m[i][j] * v[j];
            }
        }
    }

    // Summation of odd numbers
    public static int summationOdd(int[][] m) {
        int sum = 0;
        for (int[] row : m) {
            for (int n : row) {
                if (n % 2 != 0) {
                    sum += n;
                }
            }
        }
        return sum;
    }

    // Greatest number in the matrix
    public static int greatest(int[][] m) {
        int max = Integer.MIN_VALUE;
        for (int[] row : m) {
            for (int n : row) {
                if (n > max) {
                    max = n;
                }
            }
        }
        return max;
    }

    // Print matrix and vector
    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void printVector(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

