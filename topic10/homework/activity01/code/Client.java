import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 2004;

        try (Socket socket = new Socket(host, port);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             DataInputStream in = new DataInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            out.writeInt(size);

            for (int i = 0; i < size; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                int element = scanner.nextInt();
                out.writeInt(element);
            }

            int max = in.readInt();

            System.out.println("The greatest element in array is: " + max);

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
