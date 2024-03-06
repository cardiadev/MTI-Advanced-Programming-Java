import interfaces.Imatrix;

public class Matrix implements Imatrix {

    public void printVector(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public void matrixXvector(int[][] m, int[] v, int[] r) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i] += m[i][j] * v[j];
            }
        }
    }

    public void matrixXmatrix(int[][] a, int[][] b, int[][] r) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    r[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    public int summationOdd(int[][] m) {
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

    public int greatest(int[][] m) {
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
}
