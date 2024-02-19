import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println(); 

            switch (choice) {
                case 1:
                    System.out.println("Add");
                    break;
                case 2:
                    System.out.println("Delete");
                    break;
                case 3:
                    System.out.println("Update");
                    break;
                case 4:
                    System.out.println("Exit");
                    return; 
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }

            System.out.println(); 
        }
    }
}
