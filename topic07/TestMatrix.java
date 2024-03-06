import java.util.Scanner;

public class TestMatrix {

    public static Scanner scanner = new Scanner(System.in);
    private static Matrix matrixOperations = new Matrix();

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
                    System.out.println("Exiting program... Bye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again...");
            }
        }
    }

    private static void multiplyMatrixByMatrix() {
        System.out.println("\nMatrix A:");
        int[][] a = readMatrix();

        System.out.println("\nMatrix B:");
        int[][] b = readMatrix();

        if (a[0].length != b.length) {
            System.out.println("Matrices are not compatible for multiplication. Try again...");
            return;
        }

        int[][] result = new int[a.length][b[0].length];
        matrixOperations.matrixXmatrix(a, b, result);

        System.out.println("\nResult:");
        matrixOperations.printMatrix(result);
    }

    private static void multiplyMatrixByVector() {
        System.out.println("\nMatrix:");
        int[][] matrix = readMatrix();
        System.out.println("Vector (same number of elements as columns in the matrix):");
        int[] vector = new int[matrix[0].length];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter element [" + (i + 1) + "]: ");
            vector[i] = scanner.nextInt();
        }
        int[] result = new int[matrix.length];
        matrixOperations.matrixXvector(matrix, vector, result);

        System.out.println("\nResult:");
        matrixOperations.printVector(result);
    }

    private static void summationOfOddNumbers() {
        System.out.println("\nMatrix:");
        int[][] matrix = readMatrix();
        int sum = matrixOperations.summationOdd(matrix);

        System.out.println("Sum of Odd Numbers: " + sum);
    }

    private static void findGreatest() {
        System.out.println("\nMatrix:");
        int[][] matrix = readMatrix();
        int greatest = matrixOperations.greatest(matrix);

        System.out.println("Greatest number in the matrix: " + greatest);
    }

    private static int[][] readMatrix() {
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
