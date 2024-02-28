package topic06;

import java.util.Scanner;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number:");
        String input = scanner.nextLine();

        // Filter user input
        String filteredInput = input.replaceAll("[\\s\\-()]", "");

        // Filtered input - if the phone number is valid
        if (filteredInput.length() == 10 && filteredInput.matches("\\d+")) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
