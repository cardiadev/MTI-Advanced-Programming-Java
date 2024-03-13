package interfaces;

public interface Imatrix {
    void print(int[] v);
    void print(int[][] m);
    void multiply(int[][] m, int[] v, int[] r);
    void multiply(int[][] a, int[][] b, int[][] r);
}