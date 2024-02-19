public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {4, 2, 7, 10, 1};
        int i;
        int j;
        int tmp;
        int n = a.length;

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j + 1] < a[j]) { // Comparar los dos vecinos
                    tmp = a[j]; // Intercambiar a[j] y a[j+1]
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        System.out.println("Arreglo ordenado:");
        for (int valor : a) {
            System.out.print(valor + " ");
        }
    }
}
