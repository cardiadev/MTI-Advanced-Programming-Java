package topic05;

public class MatrixMulti {
    public static void main(String[] args) {
        // Define the matrix
        int[][] a = { 
            {7, 2}, 
            {1, 5}, 
            {8, 6} 
        };
        int[][] b = { 
            {2, 5, 8}, 
            {3, 4, 9} 
        };
        
        // Define the result matrix - (r = result)
        int[][] r = new int[a.length][b[0].length];

        // Call of Method to matrixXmatrix
        multiplyMatrices(a, b, r);

        // Print Result
        System.out.println("Matrix mutiplication result : ✨");
        printMatrix(r);

    }

    static void multiplyMatrices(int[][] a, int[][] b, int[][] r) {
        for (int i = 0; i < a.length; i++) { // Row A 
            for (int j = 0; j < b[0].length; j++) { // Column B
                for (int k = 0; k < a[0].length; k++) { // Column A
                    r[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
    
}
