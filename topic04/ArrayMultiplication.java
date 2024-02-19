public class ArrayMultiplication {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] result = new int[5];

        for (int i = 0; i < 5; i++) {
            arr1[i] = i + 1;
            arr2[i] = i + 1;
            result[i] = arr1[i] * arr2[i];
        }

        System.out.println("Result of multiplying arrays:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Array " + i + ": " + result[i]);
        }
    }
}
