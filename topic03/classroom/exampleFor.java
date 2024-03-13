import java.util.Scanner;

public class exampleFor {
    public static void main(String[] args) {
        for (int n = 10; n > 0; n--) {
            if (n == 5) continue; // Si n es 5, salta la iteración actual
            System.out.println(n);
        }
    }
}
