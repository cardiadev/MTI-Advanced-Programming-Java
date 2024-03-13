# Activity: 
Packages

## Description:
Activity: Use the command promt to compile and do not use an IDE to edit the files. Define “public class Operations{}” including the method “public int add(int x, int y) {}” as part of the package MyUtilities.math. Implement the method “add” and define the following class to test it (upload the directory MyUtilities and the file TestPackage.java in a ZIP file):

```java
import MyUtilities.math.Operations;

public class TestPackage {
    public static void main(String args[]) {
        Operations operations = new Operations();
         System.out.println(“result = “ + operations.add(3,5));
     }
}
```

