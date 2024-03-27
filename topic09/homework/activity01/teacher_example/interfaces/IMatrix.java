package interfaces;

public interface IMatrix {
    public void multiply(int a[][], int b[][], int r[][]) throws IllegalArgumentException, 
             ArrayIndexOutOfBoundsException;
    public void print(int m[][]);
}

