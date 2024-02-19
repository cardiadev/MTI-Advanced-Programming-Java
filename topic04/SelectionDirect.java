public class SelectionDirect {

    public static void main(String[] args) {
        int[] a = {4, 2, 7, 10, 1};
        int k; // Tiene el índice de la localidad con el menor número
        int menor; // Tiene el menor número
        int i; // Recorre el arreglo
        int j; // Recorre el arreglo a partir de i+1
        int n = a.length; // Tamaño del arreglo
        
        for(i = 0; i < n - 1; i++) {
            k = i;
            menor = a[i];
            for(j = i + 1; j < n; j++) { // Comparamos menor con a[j]
                if(a[j] < menor) {
                    k = j;
                    menor = a[k];
                }
            }
            // Intercambiamos los valores para poner el menor en su posición correcta
            a[k] = a[i];
            a[i] = menor;
        }

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int valor : a) {
            System.out.print(valor + " ");
        }
    }
}
