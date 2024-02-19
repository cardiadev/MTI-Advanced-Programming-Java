package topic05;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define rows and cols
        int rows = 3;
        int cols = 5;

        // Gnerate Matrix
        int[][] matrix = new int[rows][cols];

        // Fill Matrix
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = (j + 1) * (i + 1);
            }
        }

        // Print Matrix
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            // Next line after each row
            System.out.println();
        }
    }
}

