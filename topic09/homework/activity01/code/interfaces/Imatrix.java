package interfaces;

public interface Imatrix {
    public void print(int[] v);
    public void print(int[][] m);
    public void multiply(int[][] m, int[] v, int[] r);
    public void multiply(int[][] a, int[][] b, int[][] r);
    public int addition(int[][] a, int[][] b, int[][] r);
    public int greatest(int[][] m);
}