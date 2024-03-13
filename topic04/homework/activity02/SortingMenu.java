import java.util.Scanner;

public class SortingMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int[] array = {};

        while (option != 3) { 
            System.out.println("\nMenu:");
            System.out.println("1. Sort (ascending) - Bubble Sort");
            System.out.println("2. Sort (descending) - Bubble Sort");
            System.out.println("3. Exit");
            System.out.println(); 
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            System.out.println(); 

            switch (option) {
                case 1:
                    array = readArray(scanner);
                    bubbleSortAscending(array);
                    printArray(array);
                    System.out.println("Sort (ascending) - Bubble Sort");
                    break;

                case 2:
                    array = readArray(scanner);
                    bubbleSortDescending(array);
                    printArray(array);
                    System.out.println("Sort (descending) - Bubble Sort");
                    break;

                case 3:
                    System.out.println("Exiting... See you next time! 😉");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static int[] readArray(Scanner scanner) {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static void bubbleSortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        System.out.println("\nSorted array:\n");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(); 
    }
}
