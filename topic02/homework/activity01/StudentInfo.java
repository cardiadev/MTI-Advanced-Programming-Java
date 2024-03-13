import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = console.nextLine();

        System.out.print("Enter your registration number:");
        int registrationNumber = console.nextInt();
        console.nextLine();

        System.out.print("Enter your semester:");
        String semester = console.nextLine();

        System.out.print("Enter your course:");
        String course = console.nextLine();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Semester: " + semester);
        System.out.println("Course: " + course);
    }
}
