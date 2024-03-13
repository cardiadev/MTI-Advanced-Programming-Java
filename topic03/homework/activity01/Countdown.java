import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to start the countdown:");
        int number = scanner.nextInt();

        number--;

        while (number >= 0) {
            System.out.println(number);
            number--;
        }

        System.out.println("Countdown finished!");
    }
}
