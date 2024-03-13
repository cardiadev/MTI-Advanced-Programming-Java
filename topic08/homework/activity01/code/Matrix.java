import interfaces.Imatrix;

public class Matrix implements Imatrix {

    @Override
    public void print(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    @Override
    public void print(int[][] m) {
        for (int[] row : m) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void multiply(int[][] m, int[] v, int[] r) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i] += m[i][j] * v[j];
            }
        }
    }

    @Override
    public void multiply(int[][] a, int[][] b, int[][] r) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    r[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}
