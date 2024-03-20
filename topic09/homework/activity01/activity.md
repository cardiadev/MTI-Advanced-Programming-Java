# Activity: 
Exceptions and Assertions

## Description:
Make a program that shows the following menu:

```java
1. Multiply matrix by matrix
2. Multiply matrix by vector
3. Addition 
4. Greatest
5. Exit
```

Define the Matrix class in a separate file called Matrix.java. Implement the menu and main function in the file Menu.java. The Matrix class must implement Imatrix.

```java
package interfaces;

public interface Imatrix {
   public void print(int v[]);
   public void print(int m[][]);
   public void multiply(int m[][], int v[], int r[]);
   public void multiply(int a[][], int b[][], int r[][]);
   public int addition(int a[][], int b[][], int r[][]);
   public int greatest(int m[][]);
}
```

Define an exception handler for the exception ArrayIndexOutOfBoundException for the following methods:

```java
public void print(int v[]);
public void print(int m[][]);
public void multiply(int m[][], int v[], int r[]);
public void multiply(int a[][], int b[][], int r[][]);
public void addition(int a[][], int b[][], int r[][]);
public int greatest(int m[][]);
```

Define an exception handler for validating precondition of valid sizes of input matrix/vector for the following methods:

```java
public void multiply(int m[][], int v[], int r[]);
public void multiply(int a[][], int b[][], int r[][]);
public void addition(int a[][], int b[][], int r[][]);
```

Define assertions for validating postcondition of valid sizes of output matrix/vector for the following methods:

```java
public void multiply(int m[][], int v[], int r[]);
public void multiply(int a[][], int b[][], int r[][]);
public void addition(int a[][], int b[][], int r[][]);
```