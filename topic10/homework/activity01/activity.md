# Activity: 
Sockets

## Description:
Write a server program tha implements the operation

```java
public int greatest(int v[]);
```

Write a client program that sends an array of integers to the server by a TCP socket, receives the result over the socket and prints the result on the screen. The client program ask the user the size of the array and the content of the array.

The client and server use DataInputStream and DataOutputStream to read and write to the socket. You must use the operations writeInt() and readInt() to write and read from the socket, respectively.

Supported operations can be consulted in:



[Java Platform, Standard Edition 6 API Specification](http://docs.oracle.com/javase/6/docs/api/)
