# Activity: 
Overloading

## Description:
Implement the following interface:

```java
package interfaces;

public interface Imatrix {
    public void print(int v[]);
    public void print(int m[][]);
    public void multiply(int m[][], int v[], int r[]);
    public void multiply(int a[][], int b[][], int r[][]);
}
```

The implementation of Imatrix is defined in a separate file (in a library) from the main program.

Make a main program that shows the following menu:

```java
1. Multiply matrix by matrix
2. Multiply matrix by vector
3. Exit
```

