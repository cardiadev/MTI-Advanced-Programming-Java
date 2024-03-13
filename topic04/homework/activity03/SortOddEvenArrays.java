import java.util.Scanner;

public class SortOddEvenArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int oddCount = 0, evenCount = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];
        
        for (int i = 0, oddIndex = 0, evenIndex = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenIndex++] = numbers[i];
            } else {
                oddNumbers[oddIndex++] = numbers[i];
            }
        }

        // Ordena los arreglos en orden descendente
        selectionSort(oddNumbers);
        selectionSort(evenNumbers);

        // Muestra los arreglos
        System.out.println("Odd numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nEven numbers:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio si se encuentra un elemento menor
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        
    }
    
}
