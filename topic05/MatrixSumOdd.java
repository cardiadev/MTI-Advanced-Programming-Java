package topic05;

public class MatrixSumOdd {
    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix01 = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 10},
            {3, 6, 9, 12, 15}
        };

        // Call of Metod to sumOddNumbers
        int sum = sumOddNumbers(matrix01);

        // Print the sum of odd numbers
        System.out.println("Sum of odd numbers: " + sum + " 😉");
    }

    public static int sumOddNumbers(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) { 
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
