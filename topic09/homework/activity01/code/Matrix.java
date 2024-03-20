import interfaces.Imatrix;

public class Matrix implements Imatrix {

    @Override
    public void print(int[] v) {
        try {
            for (int n : v) {
                System.out.print("[" + n + "] ");
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds in print(int[]).");
        }
    }

    @Override
    public void print(int[][] m) {
        try {
            for (int[] row : m) {
                for (int n : row) {
                    System.out.print("[" + n + "] ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds in print(int[][]).");
        }
    }

    @Override
    public void multiply(int[][] m, int[] v, int[] r) {
        if (m[0].length != v.length || m.length != r.length) {
            throw new IllegalArgumentException("Invalid sizes for multiplication in multiply(int[][], int[], int[]).");
        }
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    r[i] += m[i][j] * v[j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds during multiplication in multiply(int[][], int[], int[]).");
        }
        assert r.length == m.length : "Invalid postcondition: The result vector does not have the expected size.";
    }

    @Override
    public void multiply(int[][] a, int[][] b, int[][] r) {
        if (a[0].length != b.length || a.length != r.length || b[0].length != r[0].length) {
            throw new IllegalArgumentException("Invalid sizes for multiplication in multiply(int[][], int[][], int[][]).");
        }
        try {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        r[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds during multiplication in multiply(int[][], int[][], int[][]).");
        }
        assert r.length == a.length && r[0].length == b[0].length : "Invalid postcondition: The result matrix does not have the expected size.";
    }

    @Override
    public int addition(int[][] a, int[][] b, int[][] r) {
        int greatestValue = Integer.MIN_VALUE;
        try {
            assert a.length == b.length && a[0].length == b[0].length : "Matrices must be of the same size.";
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    r[i][j] = a[i][j] + b[i][j];
                    if (r[i][j] > greatestValue) {
                        greatestValue = r[i][j];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds during addition.");
        }
        return greatestValue;
    }

    @Override
    public int greatest(int[][] m) {
        int greatest = Integer.MIN_VALUE;
        try {
            for (int[] row : m) {
                for (int n : row) {
                    if (n > greatest) {
                        greatest = n;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds while finding greatest.");
        }
        return greatest;
    }
}
