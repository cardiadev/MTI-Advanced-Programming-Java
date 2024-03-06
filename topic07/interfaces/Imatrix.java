package interfaces;

// Code provided from Moodle by the teacher
public interface Imatrix {
    void printVector(int[] v);
    void printMatrix(int[][] m);
    void matrixXvector(int[][] m, int[] v, int[] r);
    void matrixXmatrix(int[][] a, int[][] b, int[][] r);
    int summationOdd(int[][] m);
    int greatest(int[][] m);
}
