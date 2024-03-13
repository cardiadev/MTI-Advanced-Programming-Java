import java.util.Scanner;

public class Stdin2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Name: ");
        String name = console.nextLine();

        System.out.print("Enrollment number: ");
        int number = console.nextInt();

        System.out.print("Double number: ");
        double doubleNumber = console.nextDouble();

        System.out.println("\nThe Data entered is:");
        System.out.println("Name : " + name);
        System.out.println("Enrollment number : " + number);
        System.out.println("Double number : " + doubleNumber);
    }
}
