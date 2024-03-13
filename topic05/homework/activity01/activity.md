# Activity: 
Operations with Matrices

## Description:
Make a program that shows the following menu:

```java
1. Multiply matrix by matrix (4 points)
2. Multiply matrix by vector  (2 points)
3. Summation of odd numbers  (1 point)
4. Greatest  (1 point)
5. Exit
```

The program is in a loop showing the menu until the Exit option is selected. The users first selects an option (if it is not 5) the program asks for the size of the matrices or vectors involved. Then the program asks for each integer number in the matrix or vector.

In option 1 and 2, the program asks for two matrices/one matrix and a vector and shows the result of the multiplication. In option 3 and 4, the program asks for one matrix and shows the resulting number. The program must make sure that the matrices and vectors are compatible for the multiplication.

Implement the following operations:

```java
public void matrixXmatrix(int m[][], int b[][], int r[][]);
public void matrixXvector(int a[][], int v[], int r[]);
public int summationOdd(int m[][]);
public int greatest(int m[][]);
public void printMatrix(int m[][])
public void printVector(int v[]);
```




The implementation of multiplying a matrix by a vector:


```java
static void matrixXvector(int m[][], int v[], int r[]) {
        for(int i=0; i<m.length; i++)
            for(int j=0; j<m[0].length; j++)
               r[i] = r[i] + v[j] * m[i][j];
}
```