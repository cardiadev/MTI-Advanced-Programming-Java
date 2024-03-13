# Activity: 
Interfaces

## Description:
Activity: Modify the matrix application so that the following interface is implemented.

Define the Matrix class in a separate file. The Matrix class must implement Imatrix.

```java
package interfaces;

public interface Imatrix {
   public void printVector(int v[]);
   public void printMatrix(int m[][]);
   public void matrixXvector(int m[][], int v[], int r[]);
   public void matrixXmatrix(int a[][], int b[][], int r[][]);
   public int summationOdd(int m[][]);
   public int greatest(int m[][]);
}
```

